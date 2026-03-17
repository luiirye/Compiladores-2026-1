package AtividadePraticaExpressoesRegulares.Parte04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao08 extends Base {
    public void executar(){

        String texto = "Telefone: (67) 99876-1234";
        //saída espera: Telefone: (67) 9****-1234
        String regra = "\\((\\d{2})\\) (\\d{5})-(\\d{4})";

        Pattern p = Pattern.compile(regra);
        Matcher m = p.matcher(texto);

        String mascara = m.replaceAll("($1) 9****-$3");

        System.out.println("Número de telefone: " + texto);
        System.out.println("Telefone mascarado: " + mascara);
    }
}
