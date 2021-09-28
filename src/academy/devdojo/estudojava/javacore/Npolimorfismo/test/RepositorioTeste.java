package academy.devdojo.estudojava.javacore.Npolimorfismo.test;

import academy.devdojo.estudojava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.estudojava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
