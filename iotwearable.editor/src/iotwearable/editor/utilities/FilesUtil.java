package iotwearable.editor.utilities;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * Contains some methods to list files and folders from a directory
 */
public class FilesUtil {
	/**
	 * Get path absolute of the project
	 * 
	 * @return a string path
	 */
	public String getPathAbsolute() {
		return this.getClass().getProtectionDomain().getCodeSource()
				.getLocation().getPath();
	}

	/**
	 * Get directory project
	 * 
	 * @return directory project
	 */
	public String getPathProject() {
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = workSpaceRoot.getProjects()[0];
		return project.getLocationURI().getPath();
	}
}
