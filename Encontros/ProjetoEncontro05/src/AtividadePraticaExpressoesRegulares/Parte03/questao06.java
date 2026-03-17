package AtividadePraticaExpressoesRegulares.Parte03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao06 extends Base {
    public void executar(){

        String texto = "Evento: 25/10/2024";
        String regra = "\\d{2,4}";

        Pattern p = Pattern.compile(regra);
        Matcher m = p.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados no texto:");

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
