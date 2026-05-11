package Mecanismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferPrimario {
    
    private BufferedReader leitor;

    private ArrayList<String> bufferPrimario;

    public ArrayList<String> getBufferPrimario() {
        return bufferPrimario;
    }

    // Construtor da classe
    public BufferPrimario(BufferedReader leitor) {
        this.leitor = leitor;
    }

    public void processarDadosDoBufferPrimario() {
        
        // Inicializando a coleção do ArrayList
        this.bufferPrimario = new ArrayList<>();

        try {
            String linha;
            while ((linha = this.leitor.readLine()) != null) {
                bufferPrimario.add(linha);
            }
        }
        catch(IOException e) {
            System.err.println("Erro ao fechar o arquivo.");
            System.err.println();
        }
        finally {
            if (this.leitor != null ){
                try {
                    this.leitor.close();
                }

                catch (IOException e) {
                    System.err.println("Erro ao fechar o arquivo.");
                    System.err.println(e);
                }
            }
        }
    }

    public void imprimirConteudoDoBufferPrimario(Boolean flag){
        
        // Apenas a variável dentro do if, interprata-se como flag == true, po exemplo

        if (flag) {
            System.out.println("### Conteúdo do Buffer Primário ###");

            // Para ler um array, utiliza-se um for eache
            for (String texto : this.bufferPrimario) {
                System.out.println(texto);
            }
        }
    }

}
