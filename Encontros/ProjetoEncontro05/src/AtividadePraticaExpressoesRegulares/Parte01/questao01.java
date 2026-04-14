package AtividadePraticaExpressoesRegulares.Parte01;

import java.util.regex.Matcher; // Verificador
import java.util.regex.Pattern; // Molde


public class questao01 extends Base {

    //@Override
    public void executar(){
        
        String texto = "1234a510";
        String regra = "^[0-9]+$"; // ^ -> início da string, $ -> fim da string, [0-9] -> dígitos de 0 a 9, {6} -> exatamente 6 dígitos

        Pattern molde = Pattern.compile(regra);
        Matcher verifica = molde.matcher(texto);

        System.out.println("String analisada: "+texto);
        
        if(verifica.matches()){
            System.out.println("O texto só tem números positivos");
        } else {
            System.out.println("O texto não possui apenas números");
        }
    }
}
