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
LOGICAL_OR_ASSINGMENT  = "||"

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

"class"						 { return createToken("class", yytext()); }
"if"                         { return createToken("if", yytext()); }
"for"                        { return createToken("for", yytext());}
"for each"
"const"
"extends"
"function"
"get"
"implements"
"interface"
"namespace"
"package"
"set"
"var"
"import"
"include"
"use namespace"
"break"
"case"
"continue"
"default"
"do"
"while"
"else"
"label"
"return"
"super"
"switch"
"throw"
"try"
"catch"
"finally"
"with"
"dynamic"
"final"
"internal"
"native"
"override"
"private"
"protected"
"public"
"static"
"false"
"null"
"this"
"true"
"int"
"String"
"Boolean"
"Number"
"uint"
"++"                         { return createToken("incremento", yytext());}
{BRANCO}                     { return createToken("branco", yytext()); }
{IDENTIFIER}                 { return createToken("identificador", yytext()); }
{INTEIRO}                    { return createToken("inteiro", yytext()); }



. { throw new RuntimeException("Caractere inválido " + yytext()); }
