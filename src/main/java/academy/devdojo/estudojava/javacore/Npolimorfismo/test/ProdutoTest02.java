package academy.devdojo.estudojava.javacore.Npolimorfismo.test;

import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryze 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("-----------------------------------------");
        Produto produto2 = new Tomate("Americano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
