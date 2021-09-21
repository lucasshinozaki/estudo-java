package academy.devdojo.estudojava.javacore.Bintroducaometodos.test;

import academy.devdojo.estudojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
