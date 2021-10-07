package academy.devdojo.estudojava.javacore.Oexception.exception.test;

import academy.devdojo.estudojava.javacore.Oexception.exception.dominio.LoginIvalidoException;

import java.util.Scanner;

public class LoginIvalidoExceptioTest01 {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginIvalidoException e){
            e.printStackTrace();
        }
    }
    public static void logar() throws LoginIvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginIvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");

    }
}
