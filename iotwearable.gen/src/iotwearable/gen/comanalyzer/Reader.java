package iotwearable.gen.comanalyzer;

import iotwearable.gen.utilities.GenLogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public  String readNoun() {
		String line = null;
		String result = "";
		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			fileReader = new FileReader(this.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getPath() +"src/"+ this.getClass().getResource("nouns.txt").getPath());
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if(result.isEmpty())
					result += line.trim();
				else
					result += "|" + line.trim();
			}
			bufferedReader.close();
		} catch (IOException e) {
			GenLogger.addLog("Error: Can not read the noun dictionary.\n"
					+ "This dictionary is used for analyzing the sentences described in the schema.");
		}
		return result;
	}
}
