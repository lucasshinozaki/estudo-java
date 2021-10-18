package academy.devdojo.estudojava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.estudojava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções(Sem atrelamento de classes), objetivo: concisão
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car)   -> car.getColor().equals("greem") Tem que retornar um boolean

}
