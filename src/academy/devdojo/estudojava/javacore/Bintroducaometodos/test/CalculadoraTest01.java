package academy.devdojo.estudojava.javacore.Bintroducaometodos.test;

import academy.devdojo.estudojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
