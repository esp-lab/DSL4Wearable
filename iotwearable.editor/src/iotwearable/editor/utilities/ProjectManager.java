package iotwearable.editor.utilities;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.StateSchema;
import iotwearable.utilities.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * 
 * Manage project directory.
 *
 */
public class ProjectManager {

	IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();

	public ProjectManager() {

	}
	public IProject getProject(){
		return workSpaceRoot.getProject();
	}

	public String getInfo(IProject project){
		String info = "info : " + project.getName();
		if(project != null){
			for (File file : FileUtils.getFiles(project.getLocation().toString())) {
				if (FileUtils.getFileExtension(file).equals("iotw")){
					if (classify(file).equals("Mainboard"))
						info += "\nMainboard: " + file.getName();
					else if(classify(file).equals("StateSchema"))
						info += "\nState Schema: " + file.getName();
				}
			}
		}
		return info;
	}

	public void refreshProject(String projectName) {
		if (projectName != null) {
			try {
				for (IProject iProject : workSpaceRoot.getProjects()) {
					if(iProject.getName().equals(projectName))
					{
						iProject.refreshLocal(IResource.DEPTH_INFINITE,
								new NullProgressMonitor());
					}
				}
			} catch (CoreException e) {
			}
		}
	}

	/**
	 * Consider the directory structure of the project. It is possible to
	 * automatically add some files if they are not already in the project.
	 * 
	 * An iot wearable project must contain one iotw file for the description
	 * for the mainboard and one iotw file for the description for the state
	 * machine (state schema)
	 * 
	 * @param project
	 *            {@link IProject}
	 * @return Returns true if the correct structure.
	 */
	public boolean isProject(IProject project) {
		int num = 0;
		String[] infos = getInfo(project).split("\n");
		for(String str : infos){
			if(str.contains("Mainboard")){
				num++;
			}
			else if(str.contains("State Schema")){
				num++;
			}
		}
		if(num >= 2)
			return true;
		return false;
	}

	public IProject getProject(String name) {
		if(name.isEmpty())
			return null;
		return workSpaceRoot.getProject(name);
	}

	/**
	 * Gets files of project
	 * 
	 * @param projectName
	 * @return files 
	 */
	public ArrayList<File> getFiles(String projectName) {
		ArrayList<File> files = new ArrayList<File>();;
		if (projectName != null) {
			for (IProject iProject : workSpaceRoot.getProjects()) {
				if (iProject.getName().equals(projectName)) {
					List<File> allFiles = FileUtils.getFiles(iProject
							.getLocation().toString());
					for (File file : allFiles) {
						if (FileUtils.getFileExtension(file).equals("iotw")) {
							String type = "";
							type = classify(file);
							if (!type.isEmpty()) {
								files.add(file);
							}
						}
					}
				}
			}
		}
		return files;
	}

	// Classify file
	public String classify(File file) {
		String line = null;
		String type = "";
		try {
			FileReader fileReader = new FileReader(file.getAbsoluteFile());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			line = bufferedReader.readLine();
			line = bufferedReader.readLine();
			if (line.contains(ArduinoUNOR3.class.getSimpleName()) && line.contains("ArduinoUNOR3")) {
				type = "Mainboard";
			} else if (line.contains(StateSchema.class.getSimpleName()) && line.contains("StateSchema")) {
				type = "StateSchema";
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return type;
	}
	/**
	 * get file in project
	 * @param projectName
	 * @param fileName
	 * @return File
	 */
	public File getFile(String projectName, String fileName)
	{
		for (IProject iProject : workSpaceRoot.getProjects()) {
			if (iProject.getName().equals(projectName)) {
				List<File> allFiles = FileUtils.getFiles(iProject
						.getLocation().toString());
				for (File file : allFiles) {
					if (FileUtils.getFileExtension(file).equals("iotw") && file.getName().equals(fileName)) {
						return file;
					}
				}
			}
		}
		return null;
	}
	/**
	 * Get projects and files of projects
	 * 
	 * @return
	 */
	public List<Node> getProjects() {
		List<Node> projectName = new ArrayList<Node>();
		for (IProject iProject : workSpaceRoot.getProjects()) {
			if (isProject(iProject)) {
				Node node= new Node(getFiles(iProject.getName()), iProject.getName());
				projectName.add(node);
			}
		}
		return projectName;
	}
	public class Node {
		public ArrayList<File> child;
		public String parrent;

		public String getParrent() {
			return parrent;
		}

		public void setChild(ArrayList<File> child) {
			this.child = child;
		}

		public void setParrent(String parrent) {
			this.parrent = parrent;
		}

		public ArrayList<File> getChild() {
			return child;
		}

		public Node(ArrayList<File> child, String parrent) {
			super();
			this.child = child;
			this.parrent = parrent;
		}

		public Node() {
		}
	}

}