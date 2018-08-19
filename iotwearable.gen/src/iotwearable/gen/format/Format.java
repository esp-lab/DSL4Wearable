package iotwearable.gen.format;

public class Format {
	public static String format(String src) {
		String result = "";
		int level = 0;
		if (src != null) {
			String[] items = src.split("\n");
			for (String item : items) {
				if (item != null) {
					if (!item.isEmpty()) {
						if (item.contains("{")&& !item.contains("}")) {
							result += addTab(level) + item.trim() + "\n";
							level++;
						} else if (item.contains("}")&&!item.contains("{")) {
							level--;
							result += addTab(level) + item.trim() + "\n";
						} else {
							result += addTab(level) + item.trim() + "\n";
						}
					}
				}
			}
		}
		return result.trim();
	}

	private static String addTab(int level) {
		String tab = "";
		if (level == 0) {
			return "";
		}
		for (int i = 0; i < level; i++) {
			tab += "\t";
		}
		return tab;
	}
}
