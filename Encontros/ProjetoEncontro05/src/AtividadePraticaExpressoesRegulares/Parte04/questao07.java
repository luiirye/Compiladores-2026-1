package AtividadePraticaExpressoesRegulares.Parte04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao07 extends Base {
    public void executar(){

        String texto = "CPF: 123.456.789-00";
        //saída espera: CPF: ***.***.***-00
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
