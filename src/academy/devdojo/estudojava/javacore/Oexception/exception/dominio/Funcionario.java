package academy.devdojo.estudojava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws LoginIvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionario");
    }
}
