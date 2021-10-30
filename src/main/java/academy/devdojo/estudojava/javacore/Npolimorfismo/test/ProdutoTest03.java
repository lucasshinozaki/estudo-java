package academy.devdojo.estudojava.javacore.Npolimorfismo.test;

import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.estudojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryze 9", 3000);
        Tomate tomate = new Tomate("Americano", 10);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
