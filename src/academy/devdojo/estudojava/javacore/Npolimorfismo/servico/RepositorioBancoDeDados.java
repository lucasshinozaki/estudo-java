package academy.devdojo.estudojava.javacore.Npolimorfismo.servico;

import academy.devdojo.estudojava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
