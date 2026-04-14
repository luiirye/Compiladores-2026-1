package test;

import java.io.IOException;

import exemplos.leitorSemTratamento;

public class testeLeitura {
    public void executar() {
        leitorSemTratamento leitor = new leitorSemTratamento();
        try {
            leitor.lerArquivo("caminho");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
