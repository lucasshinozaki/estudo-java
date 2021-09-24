package academy.devdojo.estudojava.javacore.Hherancao.test;

import academy.devdojo.estudojava.javacore.Hherancao.dominio.Endereco;
import academy.devdojo.estudojava.javacore.Hherancao.dominio.Funcionario;
import academy.devdojo.estudojava.javacore.Hherancao.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("12345678912");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("98765432112");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------------------");
        funcionario.imprime();
    }
}
