package iotwearable.gen.comanalyzer;


public class UndefinedCommandParser {
	private static String verbs = "create|update|delete|remove|make|add|build"
			+ "|change|check|choose|connect|cook|count|send|request|cancel|pay|process|confirm";
	private static String article = "a|an|the";
	private static String nouns = "";
	private Reader reader = new Reader();
	private LexicalAnalyzer verbsLexer = new LexicalAnalyzer();
	private LexicalAnalyzer articleLexer = new LexicalAnalyzer();
	private LexicalAnalyzer nounsLexer = new LexicalAnalyzer();
	
	public UndefinedCommandParser() {
		nouns = reader.readNoun();
		verbsLexer.tokenizer.add(verbs, TokenType.verb);
		articleLexer.tokenizer.add(article, TokenType.article);
		nounsLexer.tokenizer.add(nouns, TokenType.noun);
	}
	
	public String parseToName(String sentence){
		sentence = sentence.toLowerCase();
		String[] words = sentence.split(" ");
		Grammar grammar = createGrammar(sentence);
		if(grammar != null){
			if(grammar.equals(Grammar.V)){
				return words[0].toLowerCase();
			}
			if(grammar.equals(Grammar.V_A_N)){
				return words[0].toLowerCase() +upperCaseFirstCharacter( words[2]);
			}
			else if(grammar.equals(Grammar.V_N)){
				return words[0].toLowerCase() +upperCaseFirstCharacter( words[1]);
			}
		}
		return "";
	}
	private Grammar createGrammar(String sentence){
		sentence = sentence.toLowerCase();
		String[] words = sentence.split(" ");
		int index = 0;
		String grammar = "";
		while(index < words.length){
			switch (index) {
			case 0:
				grammar += defineType(words[index], TokenType.verb);
				break;
			case 1:
				String word2 = "";;
				word2 = defineType(words[index], TokenType.noun);
				if(word2.isEmpty())
					word2 = defineType(words[index], TokenType.article);
				if(!word2.isEmpty())
					grammar += "_"+word2;
				break;
			case 2:
				String word3 = "";;
				word3 = defineType(words[index], TokenType.noun);
				if(!word3.isEmpty())
					grammar += "_"+word3;
				break;
			default:
				break;
			}
			index++;
		}
		
		if(!grammar.isEmpty()){
			if(grammar.equals(Grammar.V.toString())){
				return Grammar.V;
			}
			if(grammar.equals(Grammar.V_A_N.toString())){
				return Grammar.V_A_N;
			}
			else if(grammar.equals(Grammar.V_N.toString())){
				return Grammar.V_N;
			}
		}
		return null;
	}
	
	private String defineType(String word, TokenType type){
		if(word.isEmpty())
		{
			return "";
		}
		word = word.toLowerCase();
		if(type.equals(TokenType.verb)){
			verbsLexer.lex(word);
			if(verbsLexer.getTokens().size() == 1)
				return "V";
		}
		if(type.equals(TokenType.noun)){
			nounsLexer.lex(word);
			if(nounsLexer.getTokens().size() == 1)
				return "N";
		}
		if(type.equals(TokenType.article)){
			articleLexer.lex(word);
			if(articleLexer.getTokens().size() == 1)
				return "A";
		}
		return "";
	}
	private String upperCaseFirstCharacter(String str){
		if(str.isEmpty())
			return str;
		str = str.trim().toLowerCase();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return str;
	}
}