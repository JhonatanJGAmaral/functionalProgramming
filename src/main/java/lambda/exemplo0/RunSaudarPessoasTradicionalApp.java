package lambda.exemplo0;

public class RunSaudarPessoasTradicionalApp {

    public static void main(String[] args) {

        System.out.println("\n");
        SaudacaoInterface sEm_PtBR = new DizerOi();
        sEm_PtBR.saudar();

        SaudacaoInterface sEm_EnUS = new SayHi();
        sEm_EnUS.saudar();

        SaudacaoInterface sEm_DeDE = new SagHallo();
        sEm_DeDE.saudar();

    }
}
