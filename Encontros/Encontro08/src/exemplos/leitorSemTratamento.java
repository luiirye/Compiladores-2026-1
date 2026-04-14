package exemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;

public class leitorSemTratamento {
    
    public void lerArquivo(String caminho) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader((caminho)));
        
        String linha;
        
        while((linha = br.readLine()) != null){
            
            System.out.println(linha);
        }
        
        br.close();
    }
}
