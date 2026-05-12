package Testes;

import java.io.BufferedReader;
import java.util.ArrayList;

import Mecanismo.BufferPrimario;
import Mecanismo.BufferSecundario;
import Mecanismo.LeituraArquivo;

public class TesteBufferSecundario {
    
    public static void executar() {
        //Primeiro, carregar o arquivo. Precisa de um leitor para funcionar
        LeituraArquivo leitura = new LeituraArquivo();
        leitura.carregarArquivoParaLeitor("C:\\Users\\Docker\\Documents\\teste2.txt");
        // Importante os dados para o Leitor
        leitura.importarDadosParaLeitor();

        BufferedReader leitor = leitura.getLeitor();

        BufferPrimario bfp = new BufferPrimario(leitura.getLeitor());

        bfp.processarDadosDoBufferPrimario();

        bfp.imprimirConteudoDoBufferPrimario(true);

        ArrayList<String> bufferPrimario = bfp.getBufferPrimario();
        BufferSecundario bfs = new BufferSecundario(bufferPrimario);
        bfs.processarBufferSecundario();
        bfs.imprimirConteudoBufferSecundario(true);
    }
}
