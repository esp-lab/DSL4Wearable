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
import iotwearable.gen.Manual;
import iotwearable.gen.utilities.GenLogger;
import iotwearable.utilities.FileUtils;

import org.eclipse.gef.commands.Command;

public class GenerateCodeCommand extends Command{
	ProjectManager manager;

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
			String mainboard="";
			String state ="";
			for(String fileName : project.file)
			{
				File file = manager.getFile(project.projectName,fileName);
				if(manager.classify(file).equals("Mainboard"))
					mainboard = file.getAbsolutePath().toString();
				else
					state = file.getAbsolutePath().toString();
			}
			if(!mainboard.isEmpty() && !state.isEmpty())
			{
				CodeGeneration gen = new CodeGeneration();
				String sourceCode = gen.generate(mainboard, state);
				sourceCode = sourceCode.replace("<project_iotw>", project.projectName);
				Manual manualGenerator = new Manual(mainboard);
				try {
					FileUtils.writeFile(manager.getProject(project.projectName).getLocation().toString()+"/source_code_"+project.projectName.trim()+".ino", sourceCode);
					manager.refreshProject(project.projectName);
				} catch (IOException e) {
					MessageWindow.show("Generate code", MessageContent.ErrorReadFileMainboard);
				}
				try {
					FileUtils.writeFile(manager.getProject(project.projectName).getLocation().toString()+"/manual_"+project.projectName.trim()+".html",
							manualGenerator.createManual(project.projectName));
					manager.refreshProject(project.projectName);
				} catch (IOException e) {
					MessageWindow.show("Generate code", MessageContent.ErrorReadFileStateSchema);
				}

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				String log = "Generate code for "+project.projectName.trim()+": " + dateFormat.format(date) + " by ESP-LAP WAGEN Tools";
				if(!GenLogger.getLogs().isEmpty()){
					log += "\n\nThere was a problem in the code generation process.\n"
							+"You can view the information in the log.txt file in your project directory.\n"
							+"*Note: Some serious errors could cause your program to malfunction.\n";
					log += "\n**************************Error list*******************************\n";
					for(int i = 0; i< GenLogger.getLogs().size(); i++){
						log += "\n" +(i+1)+", " +  GenLogger.getLogs().get(i);
					}

					MessageWindow.show("Generate code", 
							"There was a problem in the code generation process.\n"
									+"You can view the information in the log.txt file in your project directory.\n"
									+"*Note: Some serious errors could cause your program to malfunction.");
				}
				else{
					log += "\nGenerate code completed.";
				}
				try {
					FileUtils.writeFile(manager.getProject(project.projectName).getLocation().toString()+"/log.txt", log);
					manager.refreshProject(project.projectName);
				} catch (IOException e) {
				}
			}
			else
			{
				MessageWindow.show("Generate code", MessageContent.NoProjectCanGen);
			}

		}

	}
}
