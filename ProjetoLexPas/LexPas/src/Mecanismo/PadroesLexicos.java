package Mecanismo;

public class PadroesLexicos {
    public static String COMMENT = "\\/\\/.*|\\(\\*(?:.|\\S)*\\*\\)";
    public static String NUMBER = "(?<!\\W)(?:-?\\d+(?:\\.\\d+)?)(?!\\w)";
    public static String LITERAL = "'(?:[^']|'')*'"; // Buscar melhorias
    public static String WORDS = "\\w+";
    public static String CHARACTER = "(?::=|>=|<=|<>|>|<|=|\\+|\\-|\\*|\\/|[:;,.()\\[\\]{}])"; // Buscar melhorias
    public static String IDENTIFIER = "^[A-Za-z][A-Za-z0-9_]*$";
}
