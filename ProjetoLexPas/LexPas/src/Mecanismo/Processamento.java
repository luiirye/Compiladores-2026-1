package Mecanismo;

import java.io.BufferedReader;

public class Processamento {

    public Processamento() {

    }

    public void prepararTabelaSimbolosPrograma() {
        
        LeitorDeArquivo leitor = new LeitorDeArquivo();
        
        String caminho = "C:\\Temp\\exemplo.txt";
        //String caminho = "/home/colossus/Documents/GitHub/2026-1-CPL/ProjetoLexPas/LexPas/src/Temp/exemplo.pas";
        leitor.carregarArquivoParaLeitor(caminho);
        leitor.importarArquivoParaLeitor();

        BufferedReader br = leitor.getLeitor();
        BufferPrimario bfp = new BufferPrimario(br);
        
        bfp.processarArquivoNoBufferPrimario();
        bfp.imprimirConteudoDoBufferPrimario(true);

        
    }

}
