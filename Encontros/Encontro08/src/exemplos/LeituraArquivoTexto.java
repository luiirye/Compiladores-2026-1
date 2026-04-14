package exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivoTexto {
    public static void main(String[] args) {
        
        String caminhoArquivo = "caminho/do/seu/arquivo.txt";
        
        try (FileReader fileReader = new FileReader(caminhoArquivo);
        
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String linha;
            
                while ((linha = bufferedReader.readLine()) != null) {
                
                    System.out.println(linha);
            }
        } 
    
        catch (IOException e) {
            
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
