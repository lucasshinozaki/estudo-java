package academy.devdojo.estudojava.javacore.Npolimorfismo.servico;

import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.estudojava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if(produto instanceof  Tomate){
//            Tomate tomate = (Tomate) produto;
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}

