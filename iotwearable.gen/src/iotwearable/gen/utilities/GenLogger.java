package iotwearable.gen.utilities;

import java.util.ArrayList;
import java.util.List;

public class GenLogger {
	private static GenLogger INSTANCE = null;
	private static List<String> logs = new ArrayList<String>();
	
	private GenLogger(){
	}
	
	public static void addLog(String log){
		if(INSTANCE == null){
			INSTANCE = new GenLogger();
		}
		
		logs .add(log);
	}
	public static void startLog(){
		logs.clear();
	}
	public static List<String> getLogs(){
		return logs;
	}
}