package AtividadePraticaExpressoesRegulares.Parte01;

import java.util.regex.Matcher; // Verificador
import java.util.regex.Pattern; // Molde


public class questao02 extends Base {

    //@Override
    public void executar(){
        
        String texto = "10.5 3.14 0.99";
        String regra = "(\\d^[])"; // ^ -> início da string, $ -> fim da string, [0-9] -> dígitos de 0 a 9, {6} -> exatamente 6 dígitos

        Pattern molde = Pattern.compile(regra);
        Matcher verifica = molde.matcher(texto);

        System.out.println("String analisada: " + texto);
        
        while(verifica.find()){
            if(verifica.matches()){
            System.out.println("O texto só tem números");
            } else {
                System.out.println("O texto não possui apenas números");
            }
        }
    }
}
