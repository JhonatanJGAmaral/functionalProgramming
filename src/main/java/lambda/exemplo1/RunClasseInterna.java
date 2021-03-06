package lambda.exemplo1;

import lambda.exemplo0.SaudacaoInterface;

public class RunClasseInterna {
    public static void main(String[] args) {
        SaudacaoInterface s = new SaudacaoInterface() {
            // Essa é uma classe interna "ANÔNIMA" que está dentro da
            // RunClasseInterna{anônima pois não tem nome}

            @Override
            public void saudar() {
                System.out.println("\nOi, galero");
            }

            // @Override
            // public void despedir() {
            // System.out.println("Até logo, abigos!");
            // }
        };

        s.saudar();
        // ---------------------------------------------------------------------------//
        SaudacaoInterface bele = new SaudacaoInterface() {
            @Override
            public void saudar() {
                System.out.println("\nBele truta?");
            }

            // @Override
            // public void despedir() {
            // System.out.println("Até logo, amigos!");
            // }
        };

        bele.saudar();
    }
}
