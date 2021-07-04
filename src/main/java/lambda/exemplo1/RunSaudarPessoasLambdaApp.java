package lambda.exemplo1;

import lambda.exemplo0.SaudacaoInterface;

public class RunSaudarPessoasLambdaApp {

    public static void main(String[] args) {

        SaudacaoInterface s;

        s = () -> System.out.println("\nBeleza");// o "()" sem nada dentro diz que o método da interface não tem
                                                 // parâmetros, assim como vc pode notar direto dentro da interface
                                                 // "SaudarInterface"
        s.saudar();

        s = () -> System.out.println("\nOpa!");
        s.saudar();

        s = () -> System.out.println("\nSalve!");
        s.saudar();

        // --------------------------Imprime "OI" 10 vezes
        s = () -> { // Abre e fecha chaves quando houver uma sentença e não somente uma função
            int i;
            for (i = 0; i < 10; i++)
                System.out.println("OI");
        };

        s.saudar();

        // --------------------------Imprime a mensagem abaixo 10 vezes
        SaudacaoInterface teste;
        teste = () -> System.out.println("\nYou can also perform a inline function");

        s = () -> {
            for (int i = 0; i < 10; i++) {
                teste.saudar();
            }
        };

        s.saudar();

    }
}
