package Testes;

import java.io.BufferedReader;

import Mecanismo.BufferPrimario;
import Mecanismo.LeituraArquivo;

public class TesteBufferPrimario {
    
    public static void executar() {
        //Primeiro, carregar o arquivo. Precisa de um leitor para funcionar
        LeituraArquivo leitura = new LeituraArquivo();
        leitura.carregarArquivoParaLeitor("c:\\Windows\\temp\\exemplo.txt");
        // Importante os dados para o Leitor
        leitura.importarDadosParaLeitor();

        BufferedReader leitor = leitura.getLeitor();

        BufferPrimario bfp = new BufferPrimario(leitura.getLeitor());

        bfp.processarDadosDoBufferPrimario();

        bfp.imprimirConteudoDoBufferPrimario(true);

    }
}
