package academy.devdojo.estudojava.javacore.ZZAclassesinternas.test;

//Class : Top-Level
public class OuterClassesTest03 {
    private String name = "Lucas";
    //Classe static criada internamente pois só vai ser utilizada pela class top-level
    static class Nested{
        private String lastName = "Shinozaki";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
