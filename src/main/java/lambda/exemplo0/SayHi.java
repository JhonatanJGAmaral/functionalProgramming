package lambda.exemplo0;

public class SayHi implements SaudacaoInterface {

    @Override
    public void saudar() {
        System.out.println("Hi There!");
    }

    // @Override
    // public void despedir() {
    // System.out.println("See you, guys!");
    // }
}
