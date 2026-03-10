package AtividadePraticaExpressoesRegulares.Parte01;

import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class questao01 {

    public void executar(){
        String texto = "1234510-11";

        //Expressão regular para números
        String regex = "^[0-9]+$";
        // ^ indica o começo da string
        // $ indica o fim da string

        // Compila a exmpressão regular
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        System.out.println("String analisada é: " + texto);
        if(matcher.matches() == true){
            System.out.println("A string contém apenas números");

        } else {
            System.out.println("A string contém outros caracteres");
        }
    }
}
