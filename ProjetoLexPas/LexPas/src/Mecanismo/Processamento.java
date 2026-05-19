package Mecanismo;

import java.io.BufferedReader;
import java.util.ArrayList;
import Testes.TesteBufferPrimario;
import Testes.TesteBufferSecundario;

import Dominio.Token;

public class Processamento {

    private ArrayList<Token> tabelaSimbolosPrograma;

    public Processamento(){
    }

    public void prepararTabelaSimbolosPrograma(){
        LeitorDeArquivo leitor = new LeitorDeArquivo();
        String caminho = "C:\\Users\\Docker\\Documents\\Estudos\\Compiladores-2026-1\\ProjetoLexPas\\LexPas\\src\\Temp\\exemplo.pas";
        //String caminho = "/home/colossus/Documents/GitHub/2026-1-CPL/ProjetoLexPas/LexPas/src/Temp/exemplo.pas";
        leitor.carregarArquivoParaLeitor(caminho);
        leitor.importarArquivoParaLeitor();

        BufferedReader br = leitor.getLeitor();
        BufferPrimario bfp = new BufferPrimario(br);
        bfp.processarArquivoNoBufferPrimario();
        bfp.imprimirConteudoDoBufferPrimario(true);

        ArrayList<String> buffer = bfp.getBufferPrimario();
        BufferSecundario bfs = new BufferSecundario(buffer);
        bfs.processarBufferSecundario();
        bfs.imprimirConteudoBufferSecundario(true);

        this.tabelaSimbolosPrograma = bfs.getBufferSecundario();
    }

    public void imprimirTabelaSimbolosPrograma(){
        System.out.println("**************************************");
        System.out.println("*** TABELA DE SIMBOLOS DO PROGRAMA ***");
        System.out.printf("%-20s|%-15s\n", "LEXEMA", "TIPO IDENTIFICADOR");
        System.out.println("**************************************");

        for (Token token : this.tabelaSimbolosPrograma) {
            System.out.printf("%-20s|%-15s\n", token.getLexema(), token.getTipo());
        }
    }
}
