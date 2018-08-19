package iotwearable.gen.cce.device;

import iotwearable.gen.comanalyzer.Token;

import java.util.LinkedList;

/**
 * 
 * Used for classes to generate source code on {@link Mainboard}.
 * The generated code may not be complete.
 * Which have keywords to mark the position that needs to be replaced in the process next.
 *
 */
public abstract class DeviceCodeCreationEngine{	
	/**
	 * Generate code for the {@linkplain include} part.
	 * @return {@literal #include <Library_Name.h>}
	 */
	abstract public String createInclude();
	/**
	 * Generate code for define part of {@link Device}.
	 * @return String
	 */
	abstract public  String createDefine();
	/**
	 * Generate code the setup for the device in the setup function.
	 * @return String
	 */
	abstract public  String createInitSetup();
	/**
	 * Generate code the setup for the device in the loop function.
	 * @return String
	 */
	abstract public  String createInitLoop();
	abstract public String createPrototype();
	abstract public String createMethodImpl();
	/**
	 * Generate code from the command.
	 * @param syntax
	 * @param tokens
	 * @return String
	 */
	abstract public  String createFromCommand(String syntax, LinkedList<Token> tokens);
}