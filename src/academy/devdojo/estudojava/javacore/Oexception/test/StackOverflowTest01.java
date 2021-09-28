package academy.devdojo.estudojava.javacore.Oexception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        //Erro na Stack
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
