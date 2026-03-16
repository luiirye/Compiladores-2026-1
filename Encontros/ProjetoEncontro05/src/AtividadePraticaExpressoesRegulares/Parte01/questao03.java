package AtividadePraticaExpressoesRegulares.Parte01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao03 extends Base  {
    public void executar(){

        String texto = "15/03/2025";
        String regra = "^[0-9]{2}+/+[0-9]{02}+/+[0-9]{4}?";
        // ^ para inicio da regra e ? para final da regra
        // números limitados á dois + "/" + números limitados á dois + "/" + números limitados á quatro 
        // regra para validação de datas
        
        Pattern pattern = Pattern.compile(regra);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("String analisada: " + texto);

        if(matcher.matches()){
            System.out.println("O texto é uma data válida");
        } else {
            System.out.println("O texto não é uma data válida");
        }

    }
}
