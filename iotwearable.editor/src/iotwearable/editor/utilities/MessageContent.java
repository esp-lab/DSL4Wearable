package iotwearable.editor.utilities;

public class MessageContent {
	/**
	 * Message: No pins suitable for the connection.
	 */
	public static final String NoPinSuitable = "No pins suitable for the connection.";
	/**
	 * Message: Error reading file mainboard.iotw.
	 */
	public static final String ErrorReadFileMainboard = "Error reading file mainboard.iotw.";
	/**
	 * Message: Error reading file stateSchema.iotw.
	 */
	public static final String ErrorReadFileStateSchema = "Error reading file stateSchema.iotw.";
	/**
	 * There aren't project can be generate code.
	 * Note: A project iot wearable must contain a file mainboard.iotw and a file stateSchema.iotw.
	 * The name file of the same as described.
	 */
	public static final String NoProjectCanGen = "There aren't project can be generate code.\n"
			+ "A project DSL4Wearable must contain a file mainboard and a file state schema.";
	public static final String ErrorChooseProject = "You must choose 2 file source in one project to generate code";
}