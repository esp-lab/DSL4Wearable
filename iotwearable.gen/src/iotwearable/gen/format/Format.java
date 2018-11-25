package iotwearable.gen.format;

public class Format {
	public Format() {
	}
	public static String format(String src) {
		StringBuilder result = new StringBuilder();
		int level = 0;
		if (src != null) {
			String[] items = src.split("\n");
			for (String item : items) {
				if (item != null && !item.isEmpty()) {
					if(item.endsWith(") {")){
						result.append(addEnter(level) + item.trim()+ "\n");
						level++;
					}
					else if(item.contains("/*") || item.contains("*/")) {
						result.append(formatCommand(item));
					}
					else if (item.contains("{")&& !item.contains("}")) {
						result.append(addTab(level) + item.trim() + "\n");
						level++;
					} else if (item.contains("}")&&!item.contains("{")) {
						level--;
						result.append(addTab(level) + item.trim() + "\n");
					}
					else if(level==0){
						result.append(formatDeclarePrototype(item));
					}
					else {
						result.append(addTab(level) + item.trim() + "\n");
					}
				}
			}
		}
		return result.toString();
	}

	private static String addTab(int level) {
		StringBuilder tab = new StringBuilder();
		if (level == 0) {
			return "";
		}
		for (int i = 0; i < level; i++) {
			tab.append("\t");
		}
		return tab.toString();
	}
	private static String addEnter(int level) {
		String tab = "";
		if (level == 0) {
			return "\n";
		}
		return tab;
	}
	private static String formatDeclarePrototype(String code) {
		return code +"\n\n";

	}
	private static String formatCommand(String code) {
		if( code.startsWith("/*") && code.endsWith("*/")) {
			return "\n" +code + "\n\n";
		}
		else if(code.startsWith("/*")) {
			return "\n" + code;
		}
		else
			return code +"\n\n";
	}
}
