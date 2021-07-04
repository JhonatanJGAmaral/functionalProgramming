package lambda.exemplo2b;

public class Exemplo0 {
    public static void main(String[] args) {

        MyFunctionInterface fi;

        // Calcula a 5ª potência de um número inteiro
        fi = (int x) -> {
            return (long) Math.pow(x, 5);
        };

        int randomNumber = 3;
        System.out.println("\nO resultado de " + randomNumber + " ^ 5 é: " + fi.calc(randomNumber));

        // Já aqui, calcula a raiz cúbica
        randomNumber = 27;
        fi = (int x) -> (double) Math.cbrt(x);
        System.out.println("\nA raiz cúbica de " + randomNumber + " é: " + fi.calc(randomNumber));

        // E aqui, finalmente, converte de milímetros para decímetos ou centímetros para
        // metros
        randomNumber = 580;
        fi = (x) -> x * 0.01;
        System.out
                .println("\n" + randomNumber + " mm convertidos para decímetros resulta em: " + fi.calc(randomNumber));
    }
}
