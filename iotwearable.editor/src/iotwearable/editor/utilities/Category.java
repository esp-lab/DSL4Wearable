package iotwearable.editor.utilities;
import java.util.List;
public class Category {
	public List<String> file;
	public String projectName;
	public List<String> getFile() {
		return file;
	}
	public void setFile(List<String> file) {
		this.file = file;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Category(String projectName, List<String> file) {
		super();
		this.projectName = projectName;
		this.file = file;
	}
	public Category() {
		super();
	}


}
