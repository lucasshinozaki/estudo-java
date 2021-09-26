package academy.devdojo.estudojava.javacore.Kenum.test;

import academy.devdojo.estudojava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.estudojava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.estudojava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);


    }
}
