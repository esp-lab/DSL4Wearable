package iotwearable.gen.comanalyzer;

public enum TokenType {
	/*
	 * Keywords are in libraries
	 * These include: void, int, float, char and string...
	 */
	keyword,
	/*
	 * Literals are constant values you can use in your program.
	 * These include: 2, 'e' and "State Machine".
	 */
	integer_literal,
	character_literal,
	string_literal,
	/*
	 * separator : (also known as punctuators): punctuation characters and paired-delimiters;
	 */
	separator,
	/*
	 *operator: symbols that operate on arguments and produce results;
	 */
	operator,
	/*
	 * Identifiers are  names the programmer chooses.
	 * These include: variable,...
	 */
	identifier,
	/*
	 * Identifiers are  name of the control the programmer chooses.
	 */
	id_identifier,
	//Area for language
	verb,
	noun,
	article
}
