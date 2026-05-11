package Mecanismo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {
    // Precisa de um atributo do arquivo que precisa ler
    private String caminhoDoArquivo;
    // fazer um get para essa string

    // ctrl + . para o vs code fazer o get automático

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    private BufferedReader leitor;

    public BufferedReader getLeitor() {
        return leitor;
    }
    
    public void carregarArquivoParaLeitor() {
        System.out.println("----------------------------------");
        System.out.println("### Carregar arquivo para testes ###");

        // Para receber entrada do teclado do usuário
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o diretório: ");
        String diretorio = scan.next();

        System.out.print("informe o nome do arquivo: ");
        String nomeArquivo = scan.next();

        // Concatenando as duas strings
        this.caminhoDoArquivo = diretorio + "\\" + nomeArquivo;

        // Fechando o scanner
        scan.close();

    }


    public void carregarArquivoParaLeitor(String caminhoComleto){
        
        this.caminhoDoArquivo = caminhoComleto;

    }

    public void importarDadosParaLeitor(){

        // Inicializando o buffer do leitor como NULL
        this.leitor = null;

        // Método de tratamento de exceção interna
        try {
            this.leitor = new BufferedReader(new FileReader(this.caminhoDoArquivo));
        } 
        catch(IOException erro) {
            
            // variável "erro" armazena o erro que aconteceu no Exception
            // Transmite a lista inteira de erros que ocorreram
            System.err.println("Erro ao ler o arquivo");
            System.err.println(erro);
        }
        
    }


}
