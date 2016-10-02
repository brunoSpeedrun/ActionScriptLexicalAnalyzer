package br.com.speedrun.lexicalanalyzer;

import java.io.IOException;
import java.io.StringReader;

class Program {
	public static void main(String[] args) throws IOException {
		String expr = "  + - * == === != !== > >= < <=";

		LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expr));
		ActionScriptToken token;

        while ((token = lexical.yylex()) != null) {
            System.out.println(token.toString());
        }
	}
}
