package iotwearable.editor.command;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import iotwearable.editor.utilities.Category;
import iotwearable.editor.utilities.MessageContent;
import iotwearable.editor.utilities.ProjectManager;
import iotwearable.editor.window.ChooseProjectWindow;
import iotwearable.editor.window.MessageWindow;
import iotwearable.gen.CodeGeneration;
import iotwearable.gen.utilities.GenLogger;
import iotwearable.utilities.FileUtils;

import org.eclipse.gef.commands.Command;

public class CodeCheckerCommand extends Command{
	ProjectManager manager;
	private static final String CHECK_GRAMMAR ="Check grammar";
	public CodeCheckerCommand() {
		manager = new ProjectManager();
	}
	@Override
	public boolean canExecute() {
		return true;
	}
	@Override
	public void execute() {
		GenLogger.startLog();
		ChooseProjectWindow ui = new ChooseProjectWindow(manager.getProjects());
		Category project = ui.view();
		if( project != null)
		{
			String mainboard = "";
			String state = "";
			for(String fileName : project.getFile()){
				File file = manager.getFile(project.getProjectName(),fileName);
				if(manager.classify(file).equals("Mainboard")) {
					mainboard = file.getAbsolutePath();
				}
				else {
					state = file.getAbsolutePath();
				}
			}
			if(!mainboard.isEmpty() && !state.isEmpty()){
				CodeGeneration gen = new CodeGeneration();
				gen.generate(mainboard, state);
				generateLogBuilder(project);
			}
			else{
				MessageWindow.show(CHECK_GRAMMAR, MessageContent.NoProjectCanGen);
			}

		}

	}
	private void generateLogBuilder(Category project) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		StringBuilder logBuilder = new StringBuilder();
		logBuilder.append("Generate code for "+project.getProjectName().trim()+": " + dateFormat.format(date) + " by ESP-LAP WAGEN Tools");
		if(!GenLogger.getLogs().isEmpty()){
			logBuilder.append("\n\nThere was a problem in the code generation process.\n"
					+"You can view the information in the log.txt file in your project directory.\n"
					+"*Note: Some serious errors could cause your program to malfunction.\n"
					+ "\n**************************Error list*******************************\n");
			for(int i = 0; i< GenLogger.getLogs().size(); i++){
				logBuilder.append("\n" +(i+1)+", " +  GenLogger.getLogs().get(i));
			}

			MessageWindow.show(CHECK_GRAMMAR, 
					"There was a problem in the code generation process.\n"
							+"You can view the information in the log.txt file in your project directory.\n"
							+"*Note: Some serious errors could cause your program to malfunction.");
			try {
				FileUtils.writeFile(manager.getProject(project.getProjectName()).getLocation().toString()+"/log.txt", logBuilder.toString());
				manager.refreshProject(project.getProjectName());
			} catch (IOException e) {
				MessageWindow.show(CHECK_GRAMMAR, e.getMessage());
			}	
		}
		else{
			MessageWindow.show(CHECK_GRAMMAR, 
					"Check successful. There are no error");
		}

	}
}
