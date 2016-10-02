package br.com.speedrun.lexicalanalyzer;

%%

%{

private ActionScriptToken createToken(String nome, String value) {
    return new ActionScriptToken(nome, value, yyline, yycolumn);
}

%}

%public
%class LexicalAnalyzer
%type ActionScriptToken
%line
%column

BRANCO = [\n| |\t|\r]
IDENTIFIER = ("_"|[a-z]|[A-Z])("_"|[a-z]|[A-Z]|[0-9])*

LINE_COMMENT_DELIMITER = "//"
DOT = "."
COMMA = ","
LEFT_PARAMETER = "("
RIGHT_PARAMETER = ")"
LEFT_BRACKETS = "["
RIGHT_BRACKETS = "]"
LEFT_BRACES = "{"
RIGTH_BRACES = "}"
SEMICOLON = ";"

NAME_QUALIFIER = "::"
TYPE = ":"


PLUS = "+"
MINUS = "-"
MULTIPLICATION = "*"
DIVISION  = "/"
DECREMENT = "--"
INCREMENT = "++"
MODULO    = "%"
ASSING    = "="
ADDITION_ASSIGNMENT = "+="
SUBTRACION_ASSIGNMENT = "-="
MULTIPLICAION_ASSIGNMENT = "*="
DIVISION_ASSIGNMENT = "/="
MODULO_ASSIGNMENT = "%="

EQUAL = "=="
GREATER_THAN = ">"
GREATER_THAN_OR_EQUAL_TO = ">="
INEQUALITY = "!="
LESS_THAN = "<"
LESS_THAN_OR_EQUAL_TO = "<="
STRICT_EQUALITY = "==="
STRICT_INEQUALITY = "!=="

LOGICAL_AND = "&&"
LOGICAL_AND_ASSINGMENT = "&&="
LOGICAL_NOT = "!"
LOGICAL_OR = "||"
LOGICAL_OR_ASSINGMENT  = "||="

INTEIRO = 0|[1-9][0-9]*

%%

{LINE_COMMENT_DELIMITER}     { return createToken("delimitador de comentário em linha", yytext()); }
{DOT}						 { return createToken("ponto", yytext()); }
{COMMA}                      { return createToken("vírgula", yytext()); }
{LEFT_PARAMETER}             { return createToken("parêntese esquerdo", yytext()); }
{RIGHT_PARAMETER}            { return createToken("parêntese direito", yytext()); }
{LEFT_BRACKETS}              { return createToken("colchete esquerdo", yytext()); }
{RIGHT_BRACKETS}             { return createToken("colchete direito", yytext()); }
{LEFT_BRACES}                { return createToken("chave esquerda", yytext()); }
{RIGTH_BRACES}               { return createToken("chave direita", yytext()); }
{SEMICOLON}                  { return createToken("ponto e vígula", yytext()); }

{NAME_QUALIFIER}             { return createToken("qualificador de namespace", yytext()); }
{TYPE}                       { return createToken("qualificador de tipo", yytext()); }

{PLUS}                       { return createToken("adição", yytext()); }
{MINUS}                      { return createToken("subtração", yytext()); }
{MULTIPLICATION}             { return createToken("multiplicação", yytext()); }
{DIVISION}                   { return createToken("divisão", yytext()); }
{DECREMENT}                  { return createToken("decremento", yytext()); }
{INCREMENT}                  { return createToken("incremento", yytext()); }
{MODULO}                     { return createToken("módulo", yytext()); }
{ASSING}                     { return createToken("atribuição", yytext()); }
{ADDITION_ASSIGNMENT}        { return createToken("atribuição de adição", yytext()); }
{SUBTRACION_ASSIGNMENT}      { return createToken("atribuição de subtração", yytext()); }
{MULTIPLICAION_ASSIGNMENT}   { return createToken("atribuição de multiplicação", yytext()); }
{DIVISION_ASSIGNMENT}        { return createToken("atribuição de divisão", yytext()); }
{MODULO_ASSIGNMENT}          { return createToken("atribuição de módulo", yytext()); }

{EQUAL}                      { return createToken("igualdade", yytext()); }
{GREATER_THAN}               { return createToken("maior que", yytext()); }
{GREATER_THAN_OR_EQUAL_TO}   { return createToken("maior ou igual", yytext()); }
{INEQUALITY}                 { return createToken("desigualdade", yytext()); }
{LESS_THAN}                  { return createToken("menor que", yytext()); }
{LESS_THAN_OR_EQUAL_TO}      { return createToken("menor ou igual", yytext()); }
{STRICT_EQUALITY}            { return createToken("igualdade restrita", yytext()); }
{STRICT_INEQUALITY}          { return createToken("desigualdade restrita", yytext()); }

{LOGICAL_AND}                { return createToken("AND lógico", yytext()); }
{LOGICAL_AND_ASSINGMENT}     { return createToken("AND lógico e atribuição", yytext()); }
{LOGICAL_NOT}                { return createToken("NOT lógico", yytext()); }
{LOGICAL_OR}                 { return createToken("OR lógico", yytext()); }
{LOGICAL_OR_ASSINGMENT}      { return createToken("OR lógico e atribuição", yytext()); }

{INTEIRO}                    { return createToken("inteiro", yytext()); }

"class"						 { return createToken("class", yytext()); }
"if"                         { return createToken("if", yytext()); }
"for"                        { return createToken("for", yytext());}
"for each"                   { return createToken("for each", yytext());}
"const"                      { return createToken("const", yytext());}
"extends"                    { return createToken("extends", yytext());}
"function"					 { return createToken("function", yytext());}
"get"						 { return createToken("get", yytext());}
"implements"				 { return createToken("implements", yytext());}
"interface"					 { return createToken("interface", yytext());}
"namespace"					 { return createToken("namespace", yytext());}
"package"					 { return createToken("package", yytext());}
"set"						 { return createToken("set", yytext());}
"var"						 { return createToken("var", yytext());}
"import"					 { return createToken("import", yytext());}
"include"					 { return createToken("include", yytext());}
"use namespace"				 { return createToken("use namespace", yytext());}
"break"						 { return createToken("break", yytext());}
"case"						 { return createToken("case", yytext());}
"continue"					 { return createToken("continue", yytext());}
"default"					 { return createToken("default", yytext());}
"do"						 { return createToken("do", yytext());}
"while"						 { return createToken("while", yytext());}
"else"						 { return createToken("else", yytext());}
"label"						 { return createToken("label", yytext());}
"return"					 { return createToken("return", yytext());}
"super"						 { return createToken("super", yytext());}
"switch"					 { return createToken("switch", yytext());}
"throw"					     { return createToken("throw", yytext());}
"try"						 { return createToken("try", yytext());}
"catch"						 { return createToken("catch", yytext());}
"finally"					 { return createToken("finally", yytext());}
"with"						 { return createToken("with", yytext());}
"dynamic"					 { return createToken("dynamic", yytext());}
"final"						 { return createToken("final", yytext());}
"internal"					 { return createToken("internal", yytext());}
"native"					 { return createToken("native", yytext());}
"override"					 { return createToken("override", yytext());}
"private"					 { return createToken("private", yytext());}
"protected"					 { return createToken("protected", yytext());}
"public"					 { return createToken("public", yytext());}
"static"					 { return createToken("static", yytext());}
"false"						 { return createToken("false", yytext());}
"null"						 { return createToken("null", yytext());}
"this"						 { return createToken("this", yytext());}
"true"						 { return createToken("true", yytext());}
"int"						 { return createToken("int", yytext());}
"String"					 { return createToken("String", yytext());}
"Boolean"					 { return createToken("Boolean", yytext());}
"Number"					 { return createToken("Number", yytext());}
"uint"						 { return createToken("uint", yytext());}
"++"                         { return createToken("incremento", yytext());}

{BRANCO}                     { return createToken("branco", yytext().equals("\n") ? "\\n" : yytext().equals("\r") ? "\\r" : yytext().equals("\t") ? "\\t" : yytext()); }
{IDENTIFIER}                 { return createToken("identificador", yytext()); }




. { throw new RuntimeException("Token inválido em Action Script. \"" + yytext() + "\" Linha: " + yyline + " Coluna: " + yycolumn); }
