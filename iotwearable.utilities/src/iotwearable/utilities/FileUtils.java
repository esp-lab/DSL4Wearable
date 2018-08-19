package iotwearable.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.internal.InternalPolicy;
import org.eclipse.jface.util.Policy;

@SuppressWarnings("restriction")
public class FileUtils {
	/**
	 * Returns the 
	 * 
	 * @return {@link String} or <code>null</code> if the file cannot be found
	 */
	public static String getFilePath(Class<?> location, String fileName) {

		if (location == null)
			return new Path(fileName).toOSString();

		URL resource = location.getResource(fileName);

		if (resource == null)
			return null;
		try {
			if (!InternalPolicy.OSGI_AVAILABLE) {// Stand-alone case

				return new Path(resource.getFile()).toOSString();
			}
			return new Path(FileLocator.toFileURL(resource).getPath()).toOSString();
		} catch (IOException e) {
			Policy.logException(e);
			return null;
		}
	}
	/**
	 * Returns the file extension portion of this resource's name, or null if it does not have one. 
	 * The file extension portion is defined as the string following the last period (".") 
	 * @param path
	 * @return return extension or "" if path is empty.
	 */
	public static String getFileExtension(String path) {
        if(path.lastIndexOf(".") != -1 && path.lastIndexOf(".") != 0){
        	return path.substring(path.lastIndexOf(".")+1);
        }
        else return "";
    }
	/**
	 * Returns the file extension portion of this resource's name, or null if it does not have one. 
	 * The file extension portion is defined as the string following the last period (".") 
	 * @param file
	 * @return return extension or "" if is not file.
	 */
	public static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0){
        	return fileName.substring(fileName.lastIndexOf(".")+1);
        }
        else return "";
    }
	/**
	 * Write file
	 * @param pathFile
	 * @param content
	 * @throws IOException
	 */
	public static void writeFile(String pathFile, String content) throws IOException {
		if(pathFile == null)
			return;
		FileWriter fileWriter = new FileWriter(pathFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

	/**
	 * Read file
	 * 
	 * @param pathFile
	 * @return content of file if read success.
	 * @throws IOException
	 */
	public static String readFile(String pathFile) throws IOException {
		String line = null;
		String result = "";
		FileReader fileReader = new FileReader(pathFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			result += line + "\n";
		}
		bufferedReader.close();
		return result;
	}

	/**
	 * Extracting ZIP.
	 * 
	 * @param source
	 *            is path of zip file
	 * @param target
	 *            is path of target folder
	 */
	public static void extractZipFiles(String source, String target) {
		try {
			byte[] buf = new byte[1024];
			ZipInputStream zipinputstream = null;
			ZipEntry zipentry;
			zipinputstream = new ZipInputStream(new FileInputStream(source));
			zipentry = zipinputstream.getNextEntry();

			while (zipentry != null) {

				// for each entry to be extracted
				String entryName = zipentry.getName();

				int n;
				FileOutputStream fileoutputstream;
				File newFile = new File(entryName);

				String directory = newFile.getParent();

				// to creating the parent directories
				if (directory == null) {
					if (newFile.isDirectory()) {
						break;
					}
				} else {
					new File(target + directory).mkdirs();
				}

				if (!zipentry.isDirectory()) {
					fileoutputstream = new FileOutputStream(target + entryName);
					while ((n = zipinputstream.read(buf, 0, 1024)) > -1) {
						fileoutputstream.write(buf, 0, n);
					}
					fileoutputstream.close();
				}

				zipinputstream.closeEntry();
				zipentry = zipinputstream.getNextEntry();
			}// while

			zipinputstream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * List all the files and folders from a directory
	 * 
	 * @param directoryName
	 *            to be listed
	 */
	public static File[] getFilesAndFolders(String directoryName) {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			System.out.println(file.getName());
		}
		return fList;
	}

	/**
	 * List all the files under a directory
	 * 
	 * @param directoryName
	 *            to be listed
	 */
	public static List<File> getFiles(String directoryName) {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		List<File> files = new ArrayList<File>();
		for (File file : fList) {
			if (file.isFile()) {
				files.add(file);
			}
		}
		return files;
	}

	/**
	 * List all the folder under a directory
	 * 
	 * @param directoryName
	 *            to be listed
	 */
	public static List<File> getFolders(String directoryName) {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		List<File> files = new ArrayList<File>();
		for (File file : fList) {
			if (file.isDirectory()) {
				System.out.println(file.getName());
				files.add(file);
			}
		}
		return files;
	}

	/**
	 * List all files from a directory and its subdirectories
	 * 
	 * @param directoryName
	 *            to be listed
	 */
	public static void getFilesAndFilesSubDirectories(String directoryName) {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
			} else if (file.isDirectory()) {
				getFilesAndFilesSubDirectories(file.getAbsolutePath());
			}
		}
	}
}
