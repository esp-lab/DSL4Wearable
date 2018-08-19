package iotwearable.gen;

import iotwearable.gen.format.Format;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StateSchema;

public class CodeGeneration {
	public String generate(String pathMainboard, String pathStateSchema){
		Mainboard mainboard = Convert.convertToMainboard(pathMainboard);
		StateSchema stateSchema = Convert.convertToStateSchema(pathStateSchema);
		CodeWriter codeWriter = new CodeWriter();
		DeviceAnalyzer deviceAnalyzer = new DeviceAnalyzer();
		deviceAnalyzer.analyze(mainboard, codeWriter);
		StateSchemaAnalyzer schemaAnalyzer = new StateSchemaAnalyzer(stateSchema,mainboard, codeWriter );
		schemaAnalyzer.analyze();
		codeWriter.cleanTag();
		return  Format.format(codeWriter.getSourceCode());
	}
}
