package academy.devdojo.estudojava.javacore.Npolimorfismo.servico;

import academy.devdojo.estudojava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
