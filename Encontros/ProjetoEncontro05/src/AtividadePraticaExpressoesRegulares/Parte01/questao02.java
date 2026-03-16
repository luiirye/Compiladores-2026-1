package AtividadePraticaExpressoesRegulares.Parte01;

import java.util.regex.Matcher; // Verificador
import java.util.regex.Pattern; // Molde


public class questao02 extends Base {

    //@Override
    public void executar(){
        
        String texto = "10.5777";
        String regra = "^[0-9]+(.[0-9]*)$";
        // números + ponto + dígitos adicionais
        // ^Começa string + apenas números + ponto + dígitos (* para ter um ou mais números) Fim string
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
