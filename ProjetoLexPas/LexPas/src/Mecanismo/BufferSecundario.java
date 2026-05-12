package Mecanismo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Dominio.TabelaSimboloLinguagem;
import Dominio.Token;
import Dominio.TokenType;

public class BufferSecundario {

    public ArrayList<String> BufferPrimario;

    public ArrayList<Token> BufferSecundario;

    public ArrayList<Token> getBufferSecundario() {
        return this.BufferSecundario;
    }

    public BufferSecundario(ArrayList<String> buffer) {
        this.BufferPrimario = buffer;
    }

    // MÉTODOS RESPONSÁVEIS POR AVALIAR EXPRESSÕES REGULARES

    private Boolean IsCharacter(String valor) {
        Pattern patt = Pattern.compile(PadroesLexicos.CHARACTER);
        Matcher match = patt.matcher(valor); // Valor pega um possível lexema
        return match.find();
    }

    private Boolean IsIdentifier(String valor) {
        Pattern patt = Pattern.compile(PadroesLexicos.IDENTIFIER);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    private Boolean IsLIteral(String valor) {
        Pattern patt = Pattern.compile(PadroesLexicos.LITERAL);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    private Boolean IsNumber(String valor) {
        Pattern patt = Pattern.compile(PadroesLexicos.NUMBER);
        Matcher match = patt.matcher(valor);
        return match.find();
    }

    public void processarBufferSecundario() {
        // Necessita de todas as expressões importantes para o regex
        // É precisso concatenar as expressões menos importantes
            String capture = 
                PadroesLexicos.COMMENT + "|" + 
                PadroesLexicos.NUMBER + "|" +
                PadroesLexicos.LITERAL + "|" +
                PadroesLexicos.WORDS + "|" + 
                PadroesLexicos.CHARACTER +  "|";
                // PIPE = OU
        
        this.BufferSecundario = new ArrayList<>();
        
        // Armazenar todos os lexemas

        ArrayList<String> lexemasProcessados= new ArrayList<>();

        Pattern patt = Pattern.compile(capture);

        int linha = 1;

        for (String texto: this.BufferPrimario) {
            Matcher match = patt.matcher(texto);
            Token valor = null;

            while(match.find()) {
                String lexema = match.group();
                int posicao = match.start();
                if ((lexema.startsWith("//")) || (lexema.startsWith("(*"))) {
                    continue;
                }

                if (!lexemasProcessados.contains(lexema)) {
                    lexemasProcessados.add(lexema);
                    if (TabelaSimboloLinguagem.contem(lexema)) {
                        TokenType tipo = TabelaSimboloLinguagem.buscar(lexema);
                        valor = new Token(tipo, lexema, linha, posicao);
                        
                    }

                    else if (this.IsCharacter(lexema)) {
                        valor = new Token(TokenType.CHARACTER, lexema, linha, posicao);
                    }
                    else if (this.IsIdentifier(lexema)) {
                        valor = new Token(TokenType.IDENTIFIER, lexema, linha, posicao);
                    }
                    else if (this.IsLIteral(lexema)) {
                        valor = new Token(TokenType.LITERAL, lexema, linha, posicao);
                    }
                    else if (this.IsNumber(lexema)) {
                        valor = new Token(TokenType.NUMBER, lexema, linha, posicao);
                    }

                    else {
                        valor = new Token(TokenType.NUMBER, lexema, linha, posicao);
                    }
                    this.BufferSecundario.add(valor);
                }
            
            }
            linha++;
        }       
    }
    public void imprimirConteudoBufferSecundario(Boolean flag){
        if (flag) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("### Conteúdo do Buffer Secundario:");
            for (Token token : BufferSecundario) {
                System.out.println(token);
            }
        }
    }
}
