package iotwearable.gen.cce.device;
import java.util.ArrayList;
import java.util.LinkedList;
import iotwearable.gen.comanalyzer.Token;
import iotwearable.model.iotw.I2CLCD;

public class I2CLCDCodeCreationEngineImpl extends I2CLCDCodeCreationEngine{
	private I2CLCD  i2clcd;
	private int width;
	private int height;
	public I2CLCDCodeCreationEngineImpl(I2CLCD  i2clcd) {
		super();
		this.i2clcd = i2clcd;
		getTypeLCD();
	}
	private void getTypeLCD()
	{
		int type= i2clcd.getType().getValue();
		if(type == 0)
		{
			width = 20;
			height= 4;
		}
		else if(type == 1)
		{
			width = 16;
			height= 2;
		}
	}
	@Override
	public String createDefine() {
		return super.createDefine()
				.replaceAll("<id>", i2clcd.getId())
				.replaceAll("<width>", width+"")
				.replaceAll("<height>", height+"");
	}
	@Override
	public String createInitSetup() {
		return super.createInitSetup()
				.replaceAll("<id>", i2clcd.getId())
				.replaceAll("<cols>", width+"")
				.replaceAll("<rows>", height+"");
	}
	@Override
	public String createInitLoop() {
		return "";
	}
	@Override
	public String createFromCommand(String syntax, LinkedList<Token> tokens) {
		String command = super.createFromCommand(syntax, tokens);
		if(command.contains("<id>")){
			command = command.replaceAll("<id>", i2clcd.getId());
		}
		if(command.contains("<plitstext>"))
		{
			String result ="";
			ArrayList<String> list = splitText(tokens.get(1).instance);
			if(list.size() > height)
			{
				result =	"\n"+i2clcd.getId()+".setCursor(0, 0);"
						+ "\n"+i2clcd.getId()+".print(\"error: String out of range of LCD\");";
			}
			else
			{

				for(int i =0;i< list.size();i++)
				{
					result +=	"\n"+i2clcd.getId()+".setCursor(0, "+i+");"
							+ "\n"+i2clcd.getId()+".print(\""+list.get(i)+"\");";
				}

			}
			command = command.replaceAll("<plitstext>",result);
		}
		return command;
	}
	@Override
	public String createPrototype() {
		return "";
	}
	@Override
	public String createMethodImpl() {
		return "";
	}
	private ArrayList<String> splitText(String text)
	{
		ArrayList<String> list= new ArrayList<String>();
		int start=1;
		for(int i=1 ;i< text.length(); i++)
		{
			if((i-start)%(width-1) == 0)
			{
				if(text.charAt(i) ==' ' ){
					list.add(text.substring(start,i));
					start = i;
				}
				else
				{
					for(int j= i;j>= 0;j--)
					{
						if(text.charAt(j)==' ' )
						{
							list.add(text.substring(start,j).trim());
							start =j;
							break;
						}
					}
				}
			}
			if(text.length() - start < width)
			{
				if(text.charAt(i)!=' ')
				{
					for(int j= i;j>= 0;j--)
					{
						if(text.charAt(j)==' ' )
						{
							list.add(text.substring(start,text.length()-1).trim());
							start =text.length();
							break;
						}
					}
				}
				break;
			}
		}
		return list;
	}
}