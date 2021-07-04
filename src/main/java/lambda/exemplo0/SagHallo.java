package lambda.exemplo0;

public class SagHallo implements SaudacaoInterface {

    @Override
    public void saudar() {
        System.out.println("Hallo, Leute!");
    }

    // @Override
    // public void despedir() {
    // System.out.println("Bis später, Freunde!");
    // }
}
