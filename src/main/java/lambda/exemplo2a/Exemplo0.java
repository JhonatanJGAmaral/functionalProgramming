package lambda.exemplo2a;

public class Exemplo0 {
    public static void main(String[] args) {

        MyLambda test;

        test = () -> System.out.println("\nTESTE1\n");
        test.f1();

        test = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("TESTE2");
        };

        test.f1();
    }
}
