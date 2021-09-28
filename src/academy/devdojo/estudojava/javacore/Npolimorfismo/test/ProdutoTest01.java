package academy.devdojo.estudojava.javacore.Npolimorfismo.test;

import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.estudojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Sansung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
