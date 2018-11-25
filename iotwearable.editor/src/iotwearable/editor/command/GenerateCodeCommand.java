package iotwearable.editor.command;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import iotwearable.editor.utilities.Category;
import iotwearable.editor.utilities.MessageContent;
import iotwearable.editor.utilities.ProjectManager;
import iotwearable.editor.window.ChooseProjectWindow;
import iotwearable.editor.window.MessageWindow;
import iotwearable.gen.CodeGeneration;
import iotwearable.gen.Manual;
import iotwearable.gen.utilities.GenLogger;
import iotwearable.utilities.FileUtils;

import org.eclipse.gef.commands.Command;

public class GenerateCodeCommand extends Command{
	ProjectManager manager;
	private static final String GENERATE_CODE ="Generate code";
	public GenerateCodeCommand() {
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
				String sourceCode = gen.generate(mainboard, state);
				
				generateSources(gen.splitCode(sourceCode), project.getProjectName().trim());
				generateSourceCode(sourceCode, project.getProjectName().trim());
				generateManual(mainboard, project);
				generateLogBuilder(project);
			}
			else{
				MessageWindow.show(GENERATE_CODE, MessageContent.NoProjectCanGen);
			}

		}

	}
	private void generateSourceCode(String sourceCode, String projectName){
	
		sourceCode = sourceCode.replace("<project_iotw>", projectName);
		
		try {
			FileUtils.writeFile(manager.getProject(projectName).getLocation().toString()+"/source_code_"+projectName+".ino", sourceCode);
			manager.refreshProject(projectName);
		} catch (IOException e) {
			MessageWindow.show(GENERATE_CODE, MessageContent.ErrorReadFileMainboard);
		}
	}
	private void generateSources(List<String> sourceCode, String projectName) {
		// write config file
		try {
			FileUtils.writeFile(manager.getProject(projectName).getLocation().toString()+"/config.h", sourceCode.get(0));
			manager.refreshProject(projectName);
		} catch (IOException e) {
			MessageWindow.show(GENERATE_CODE, MessageContent.ErrorReadFileMainboard);
		}
		// write app file 
		try {
				FileUtils.writeFile(manager.getProject(projectName).getLocation().toString()+"/App.ino", sourceCode.get(1));
				manager.refreshProject(projectName);
			} catch (IOException e) {
				MessageWindow.show(GENERATE_CODE, MessageContent.ErrorReadFileMainboard);
			}
	}
	private void generateManual(String mainboard, Category project) {
		Manual manualGenerator = new Manual(mainboard);
		try {
			FileUtils.writeFile(manager.getProject(project.getProjectName()).getLocation().toString()+"/manual_"+project.getProjectName().trim()+".html",
					manualGenerator.createManual(project.getProjectName()));
			manager.refreshProject(project.getProjectName());
		} catch (IOException e) {
			MessageWindow.show(GENERATE_CODE, MessageContent.ErrorReadFileStateSchema);
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

			MessageWindow.show(GENERATE_CODE, 
					"There was a problem in the code generation process.\n"
							+"You can view the information in the log.txt file in your project directory.\n"
							+"*Note: Some serious errors could cause your program to malfunction.");
		}
		else{
			logBuilder.append("\nGenerate code completed.");
		}
		try {
			FileUtils.writeFile(manager.getProject(project.getProjectName()).getLocation().toString()+"/log.txt", logBuilder.toString());
			manager.refreshProject(project.getProjectName());
		} catch (IOException e) {
		}
	}
}
