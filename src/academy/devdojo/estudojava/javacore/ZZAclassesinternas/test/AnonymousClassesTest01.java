package academy.devdojo.estudojava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal walkimg");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        //Pequeno periodo de tempo, não vai ser utilizados em outros locais
        //Criando uma subClasse anonima de animal
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
                jump();
            }
            //Só vai ser possível ser chamado na subclasse anonima
            public void jump(){

            }
        };
        animal.walk();
    }
}
