import Mecanismo.Processamento;

public class App {
    public static void main(String[] args) throws Exception {
        executar();
    }

    private static void executar(){
        Processamento proc = new Processamento();
        proc.prepararTabelaSimbolosPrograma();
        proc.imprimirTabelaSimbolosPrograma();
    }
}