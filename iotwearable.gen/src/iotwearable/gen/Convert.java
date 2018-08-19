package iotwearable.gen;

import iotwearable.gen.utilities.GenLogger;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateSchema;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * Converts a file iotw type to object instances .
 */
public class Convert {
	/**
	 * Read file iotw convert to {@link Mainboard} object.
	 * 
	 * @param path
	 * @return return {@link Mainboard} or null if convert failed.
	 */
	public static Mainboard convertToMainboard(String path) {
		File file = new File(path);
		if (file.exists()) {
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			ResourceSet rset = new ResourceSetImpl();
			rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("iotw", new XMIResourceFactoryImpl());
			rset.getPackageRegistry().put(IotwPackage.eNS_URI, IotwPackage.eINSTANCE);
			Resource resource = rset.createResource(fileURI);
			/**
			 * Load options that significantly improved the performance of
			 * loading EMF Model instances
			 */
			Map<Object, Object> loadOptions = ((XMLResourceImpl) resource).getDefaultLoadOptions();
			try {
				resource.load(loadOptions);
			} catch (IOException e) {
					GenLogger.addLog("Error: Can not load contents of mainboard description file.");
			}
			if (resource.getContents().get(0) instanceof Mainboard) {
				return (Mainboard) resource.getContents().get(0);
			}
		}
		return null;
	}

	/**
	 * Read file iotw convert to {@link StateSchema} object.
	 * 
	 * @param path
	 * @return return {@link StateSchema} or null if convert failed.
	 */
	public static  StateSchema convertToStateSchema(String path) {
		File file = new File(path);
		if (file.exists()) {
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			ResourceSet rset = new ResourceSetImpl();
			rset.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("iotw", new XMIResourceFactoryImpl());
			rset.getPackageRegistry().put(IotwPackage.eNS_URI,
					IotwPackage.eINSTANCE);
			Resource resource = rset.createResource(fileURI);
			/**
			 * Load options that significantly improved the performance of
			 * loading EMF Model instances
			 */
			Map<Object, Object> loadOptions = ((XMLResourceImpl) resource)
					.getDefaultLoadOptions();
			try {
				resource.load(loadOptions);
			} catch (IOException e) {
				GenLogger.addLog("Error: Can not load contents of state schame description file.");
			}
			if (resource.getContents().get(0) instanceof StateSchema) {
				return (StateSchema) resource.getContents().get(0);
			}
		}
		return null;
	}
}