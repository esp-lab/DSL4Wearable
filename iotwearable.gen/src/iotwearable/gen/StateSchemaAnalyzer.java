package iotwearable.gen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import iotwearable.gen.comanalyzer.DefinedCommandParser;
import iotwearable.gen.comanalyzer.UndefinedCommandParser;
import iotwearable.gen.utilities.GenLogger;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;

public class StateSchemaAnalyzer {
	private StateSchema stateSchema;
	private Mainboard mainboard;
	private CodeWriter codeWriter;
	private String conditionToSetStatus;
	private boolean startState;

	public StateSchemaAnalyzer(StateSchema stateSchema, Mainboard mainboard, CodeWriter codeWriter) {
		super();
		this.stateSchema = stateSchema;
		this.mainboard = mainboard;
		this.codeWriter = codeWriter;
		this.conditionToSetStatus = "";
		startState = false;
	}
	/**
	 * 
	 * @param stateSchema
	 * @param codeWriter
	 */
	public void analyze(){
		StartPoint startPoint = getStartPoint(stateSchema);
		if(startPoint == null){
			GenLogger.addLog("Error: Not found the start point." );
			return;
		}
		Queue<StateComponent> open = new LinkedList<StateComponent>();
		open.add((StateComponent)startPoint.getOutgoings().get(0).getTarget());
		List<StateComponent> closed = new ArrayList<StateComponent>();
		StateComponent currentNode = null;
		int numberOfState = 0;
		while(!open.isEmpty()){
			currentNode = open.poll();
			//Create code with state frame
			if(currentNode instanceof StateFrame){
				analyzeState((StateFrame)currentNode, numberOfState);
				numberOfState++;
				//mark the node been visited.
				closed.add(currentNode);
				//Find for all the vertices adjacent to this currentNode
				for(Connection conn : currentNode.getOutgoings()){
					if(conn.getTarget() instanceof StateComponent){
						if(!closed.contains((StateComponent)conn.getTarget())){
							open.add((StateComponent)conn.getTarget());
						}
					}
				}
			}
		}
		generateCodeSwitch(closed);	
		analyzeEvent();
	}
	private void generateCodeSwitch(List<StateComponent> components){
		String code = "\n"
				+ "switch(currentState){";

		for(StateComponent component : components){
			if(component instanceof StateFrame){
				code += "\ncase "+ component.getId()+":\n"
						+ "//<case"+component.getId()+">"
						+ "\nbreak;";
			}
		}
		code += "\ndefault:\n"
				+ "break;"
				+ "\n}";
		codeWriter.write(code, CodeWriter.loopTag);
	}
	private void analyzeState(StateFrame state, int id ){
		if(state.getName() == null){
			GenLogger.addLog("The name of StateFrame is empty.");
			return;
		}
		if(state.getName().isEmpty()){
			GenLogger.addLog("The name of StateFrame is empty.");
			return;
		}
		this.conditionToSetStatus = "";
		state.setId(id+"");
		codeWriter.write(state.getName() + ": " + id, CodeWriter.desStateTag);
		codeWriter.write( "void state" + state.getName()+"();",	CodeWriter.prototypeTag);
		if(!startState){
			//Create code for the started state. This is a state when the device has power or started.
			for(Connection conn : state.getIncomings()){
				if(conn.getSource() instanceof StartPoint){
					String result = "if(currentState == "+id+"){\n"
							+ "state" + state.getName()+"();"
							+ "\n}";
					codeWriter.write(result, CodeWriter.setupTag);
					startState = true;
					break;
				}
			}
		}
		String method = "void state" + state.getName()+"(){\n";
		if(state.getContent() != null){
			if(!state.getContent().isEmpty()){
				String[] commands = state.getContent().split("\n");
				if(commands.length > 0){
					for(int i = 0; i < commands.length; i++){
						method =  analyzeCommand(method, commands[i]);
					}
				}
			}
		}
		if(conditionToSetStatus.isEmpty()){
			method += "currentState = " + id + ";";
		}
		else{
			method += conditionToSetStatus + "){\n"
					+"currentState = " + id + ";}";
		}
		method += "\ndelay(200);"
				+ "\n}\n";
		codeWriter.write(method, CodeWriter.implTag);
	}

	private String analyzeCommand(String method, String command){
		DefinedCommandParser definedCommandParser = new DefinedCommandParser();
		String _command ="";
		_command = definedCommandParser.parse(command.trim(), mainboard);
		if(!_command.isEmpty()){
			method += _command + "\n";
		}
		else{
			method = analyzeUndifineCommand(method, command.trim());
		}
		return method;
	}

	private String analyzeUndifineCommand(String method, String command){
		UndefinedCommandParser undefinedCommandParser = new UndefinedCommandParser();
		String name = undefinedCommandParser.parseToName(command.trim());
		if(!name.isEmpty()){
			method += "int _"+name+"Status = " + name+"();\n";
			codeWriter.write( "//return 0: failed and return 1: success\n"
					+ "int "+name+"();",
					CodeWriter.prototypeTag);
			codeWriter.write("int "+name+"(){\nreturn 0;\n}",
					CodeWriter.implTag);
			if(conditionToSetStatus.isEmpty()){
				conditionToSetStatus += "if(_" + name+"Status == 1";
			}
			else{
				conditionToSetStatus  += " && _" + name+"Status == 1";
			}

		}
		else{
			method += "//Not understand: " + command.trim()+"\n";
			GenLogger.addLog("Warning: Not understand " + command.trim());
		}
		return method;
	}

	private void analyzeEvent(){
		for(StateComponent component : stateSchema.getComponents()){
			if(component instanceof StateFrame){
				for(Connection conn : component.getOutgoings()){
					if(conn.getTarget() instanceof StateFrame){
						if(conn.getLabel() != null){
							if(!conn.getLabel().isEmpty()){
								DefinedCommandParser commandParser = new DefinedCommandParser();
								String result =  commandParser.parse(conn.getLabel().trim(), mainboard);
								//Create code for the event by the user activated.
								if(!result.isEmpty()){
									if(conn.getKind().getName().equals("OUTSIDE_FLOW")
											&& !conn.getLabel().contains("send"))
									{
										result = "//Event: " + conn.getLabel().trim()+"\n"  + result;
										String resultSub = "state"+((StateFrame)conn.getTarget()).getName()+"();";
										result = result.replace("<content>", resultSub);
										codeWriter.write(result,  "//<requestWifi>");
									}
									else
									{
										result = "//Event: " + conn.getLabel().trim()+"\n"  + result;
										String resultSub = "state"+((StateFrame)conn.getTarget()).getName()+"();";
										result = result.replace("<content>", resultSub);
										codeWriter.write(result, "//<case"+component.getId()+">");
									}
								}
								else{
									//Create code for the event by the system.
									String resultSub = "//Event: " + conn.getLabel().trim()+"\n"
											+"state"+ ((StateFrame)conn.getTarget()).getName()+"();\n";
									codeWriter.write(resultSub,"//<case"+component.getId()+">");
								}

							}
							else{
								GenLogger.addLog("Event from " + ((StateFrame)conn.getSource()).getName()
										+ " to " + ((StateFrame)conn.getTarget()).getName() + " is empty.");
							}
						}
						else {
							GenLogger.addLog("Event from " + ((StateFrame)conn.getSource()).getName()
									+ " to " + ((StateFrame)conn.getTarget()).getName() + " is empty.");
						}
					}
				}
			}
		}
	}

	private StartPoint getStartPoint(StateSchema stateSchema){
		for(StateComponent control : stateSchema.getComponents()){
			if(control instanceof StartPoint)
				return (StartPoint)control;
		}
		return null;
	}
}