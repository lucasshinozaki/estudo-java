package academy.devdojo.estudojava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //classe interna
            System.out.println(OuterClassesTest01.this); //Referencia a classe externa
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
