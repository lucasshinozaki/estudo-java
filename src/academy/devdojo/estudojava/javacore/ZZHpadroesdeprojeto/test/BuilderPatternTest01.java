package academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.dominio.Person;

//personBuilder.img
public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Lucas")
                .lastName("Shinozaki")
                .username("Lucas_Shinozaki")
                .email("lucas_shinozaki@email.com")
                .build();

        System.out.println(build);
    }
}
