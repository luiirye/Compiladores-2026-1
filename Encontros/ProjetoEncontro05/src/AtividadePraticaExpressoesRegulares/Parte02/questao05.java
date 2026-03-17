package AtividadePraticaExpressoesRegulares.Parte02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao05 extends Base {
    public void executar(){

        String texto = "Maria tem 23 anos e comprou 5 2000 232 livros por 120 reais.";
        String regra = "\\d{2,9}";

        Pattern p = Pattern.compile(regra);
        Matcher m = p.matcher(texto);

        System.out.println("A string analisada é: " + texto);
        System.out.println("Números encontrados no texto:");

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
