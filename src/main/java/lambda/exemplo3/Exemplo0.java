package lambda.exemplo3;

@FunctionalInterface
interface Teste {
    public boolean proc();
}

public class Exemplo0 {
    public static void main(String[] args) {
        Teste bs;
        int x = 0, y = 1;

        bs = () -> x > y;
        System.out.println(bs.proc());

        bs = () -> true;
        System.out.println(bs.proc());
    }
}
