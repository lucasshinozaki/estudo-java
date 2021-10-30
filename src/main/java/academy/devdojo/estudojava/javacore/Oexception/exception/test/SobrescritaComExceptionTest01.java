package academy.devdojo.estudojava.javacore.Oexception.exception.test;

import academy.devdojo.estudojava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.estudojava.javacore.Oexception.exception.dominio.LoginIvalidoException;
import academy.devdojo.estudojava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try{
            funcionario.salvar();
        } catch (LoginIvalidoException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
