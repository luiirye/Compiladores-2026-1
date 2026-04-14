package AtividadePraticaExpressoesRegulares.Parte04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao07 extends Base {
    public void executar(){

        String texto = "CPF: 123.456.789-00";
        //saída espera: CPF: ***.***.***-00
        String regra = "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})";

        Pattern p = Pattern.compile(regra);
        Matcher m = p.matcher(texto);

        String mascara = m.replaceAll("***.***.***-$4");

        System.out.println("A string analisada é: " + texto);
        System.out.println("CPF Censurado: " + mascara);

        //System.out.println(m);
        //System.out.println(mascara);
    }
}
