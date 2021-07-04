package lambda.exemplo2b;

@FunctionalInterface // Anotação que garante que essa interface é funcional
public interface MyFunctionInterface {
    public double calc(int s1);// Remember: "calc" é um método abstrato, logo, ainda não se sabe o que ele faz
    // public int cal2(int s1); //É retornado um erro caso tente add um novo método
    // pois a anotação "@FunctionalInterface" não permite
}
