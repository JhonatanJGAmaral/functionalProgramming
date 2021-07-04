package lambda.exemplo0;

public interface SaudacaoInterface {
    // "interface" != classes
    // Em interfaces eu tenho constantes e métodos abstratos(todos são)

    // public void saudar();

    // public abstract void saudar();

    // Apesar de ser exequível/possível, o uso dos modificadores de acesso como
    // "public"em interfaces é dispensável e o "abstract" tb
    // Logo, a sintaxe abaixo é a mais comumente usada
    void saudar();

    // public abstract void despedir(); //Se houver + de um método por interface,
    // nenhuma classe que implementá-la será capaz de fazer uso destes métodos
    // nem fazendo uso de programção funcional ou não

    // LOGOO, uma interface funcional deve possuir um e somente UM método
}
