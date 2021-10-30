package academy.devdojo.estudojava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print() { //void print(String param) {
        String lastName = "Izuku"; //Efetivamente ela é final
        class LocalClass {
            public void printLocal() {
                //System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
