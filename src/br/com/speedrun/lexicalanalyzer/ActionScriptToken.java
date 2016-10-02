package br.com.speedrun.lexicalanalyzer;

/**
 * Classe que representa um token na linguagem Action Script.
 * @author Bruno Moura
 */
public class ActionScriptToken {
	private String name;
	private String value;
	private Integer line;
	private Integer column;
	
	/**
	 * Constrói um Token com o nome, valor, a linha e a coluna.
	 * @param name   nome do token.
	 * @param value  valo do token.
	 * @param line   linha.
	 * @param column coluna.
	 */
	public ActionScriptToken(String name, String value, Integer line, Integer column){
		this.name   = name;
		this.value  = value;
		this.line   = line;
		this.column = column;
	}
	
	/**
	 * Constrói um Token com nome e o valor.
	 * @param name  nome do token.
	 * @param value valor do token.
	 */
	public ActionScriptToken(String name, String value){
		this(name, value, 0, 0);
	}
	
	/**
	 * Acessa o nome do token.
	 * @return uma String que representa o nome do token.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Acessa o valor do token.
	 * @return uma String que representa o valor do token;
	 */
	public String getValue(){
		return value;
	}
	
	/**
	 * Acessa a linha onde o token foi achado.
	 * @return Um Integer que representa a linha onde o token foi achado.
	 */
	public Integer getLine(){
		return line;
	}
	
	/**
	 * Acessa a coluna onde o token foi achado.
	 * @return Um Integer que representa onde o token foi achado.
	 */
	public Integer getColumn(){
		return column;
	}
	
	/**
	 * Retorna uma String que representa este objeto.
	 * @return Uma String que representa este objeto no formato < nome, value > (linha - coluna)
	 */
	@Override
	public String toString() {
		return String.format("< %s, %s > (%d - %d)", name, value, line, column);
	}
}