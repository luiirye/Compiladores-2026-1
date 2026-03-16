package AtividadePraticaExpressoesRegulares.Parte04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao08 extends Base {
    public void executar(){

        String texto = "Telefone: (67) 99876-1234";
        //saída espera: Telefone: (67) 9****-1234
        String regra = "\\d\\d+";

        Pattern p = Pattern.compile(regra);
        Matcher m = p.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados no texto:");

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
