package iotwearable.gen;

import iotwearable.gen.utilities.GenLogger;
import iotwearable.utilities.FileUtils;

import java.io.IOException;

/**
 * Write the code to the marked position.
 */
public class CodeWriter {
	//Replace tag
	public static final String  projectTag = "<project_iotw>";
	public static final String includeTag= "<include_iotw>";
	public static final String desStateTag= "<desState_iotw>";
	public static final String defineTag = "<define_iotw>";
	public static final String prototypeTag = "<prototype_iotw>";
	public static final String setupTag= "<setup_iotw>";
	public static final String loopTag = "<loop_iotw>";
	public static final String implTag= "<impl_iotw>";
	
	private String sourceCode ;
	
	public CodeWriter() {
		this.sourceCode = getCodeTemplate();
	}
	
	/**
	 * Replace the content into the source code in place of the replaced tag.
	 * 
	 * @param sourceCode
	 *            is the source to be replaced.
	 * @param content
	 *            is the replacement.
	 * @param tagRep replaced.
	 * @return The source code has been written.
	 */
	public void write( String content, String tagRep)
	{
		if(content != null && tagRep != null)
			if (!content.isEmpty() && !tagRep.isEmpty()) {
				if(tagRep.equals(prototypeTag) || tagRep.equals(implTag)){
					if(sourceCode.contains(content))
						return;
				}
				this.sourceCode = sourceCode.replace(tagRep, content + "\n" + tagRep);
			}
	}
	
	public void cleanTag(){
		sourceCode = sourceCode.replaceAll(projectTag,"");
		sourceCode = sourceCode.replaceAll(includeTag,"");
		sourceCode = sourceCode.replaceAll(desStateTag,"");
		sourceCode = sourceCode.replaceAll(defineTag,"");
		sourceCode = sourceCode.replaceAll(prototypeTag,"");
		sourceCode = sourceCode.replaceAll(setupTag,"");
		sourceCode = sourceCode.replaceAll(loopTag,"");
		sourceCode = sourceCode.replaceAll(implTag,"");
	}
	
	private String getCodeTemplate() {
		try {
			String path = this.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getPath();
			return FileUtils.readFile(path	+ "/src/iotwearable/gen/arduino_code_template.txt");
		} catch (IOException e) {
			GenLogger.addLog("Error: Not found Arduino code template.");
		}
		return "";
	}

	public String getSourceCode() {
		return sourceCode;
	}
}
