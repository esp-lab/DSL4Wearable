package iotwearable.gen;

import iotwearable.gen.cce.device.CodeCreationEngineFactory;
import iotwearable.gen.cce.device.DeviceCodeCreationEngine;
import iotwearable.model.iotw.Device;
import iotwearable.model.iotw.Mainboard;

/**
 * 
 * Device analyzer: 
 * Analyze the devices on the mainboard to generate the corresponding code
 * using {@link IDeviceCodeCreationEngine}. 
 * After having the code, using CodeWrite to write to src (a String variable)
 * is rotated each time the code is generated. 
 * This section focuses on the components of the code,
 * including the include, define, and accompanying components for each device
 *
 */
public class DeviceAnalyzer {
	/**
	 * Analyze the devices on the mainboard to generate the source code and write into {@link src}.
	 * @param mainboard
	 * @param codeWriter
	 */
	public void analyze(Mainboard mainboard, CodeWriter codeWriter) {
		for (Device device : mainboard.getDevices()) {
			DeviceCodeCreationEngine codeCreationEngine = CodeCreationEngineFactory.create(device);
			String include = codeCreationEngine.createInclude();
			if(include.contains("\n")){
				String[] includes = include.split("\n");
				for(String _include : includes){
					if (!codeWriter.getSourceCode().contains(_include)) {
						codeWriter.write(_include, CodeWriter.includeTag);
					}
				}
			}
			else{
				if (!codeWriter.getSourceCode().contains(include)) {
					codeWriter.write(include, CodeWriter.includeTag);
				}
			}
			codeWriter.write(codeCreationEngine.createDefine(), CodeWriter.defineTag);
			codeWriter.write(codeCreationEngine.createInitSetup(), CodeWriter.setupTag);
			codeWriter.write(codeCreationEngine.createInitLoop(), CodeWriter.loopTag);
			codeWriter.write(codeCreationEngine.createPrototype(), CodeWriter.prototypeTag);
			codeWriter.write(codeCreationEngine.createMethodImpl(), CodeWriter.implTag);
		}
	}
}