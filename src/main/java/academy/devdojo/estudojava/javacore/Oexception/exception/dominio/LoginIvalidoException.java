package academy.devdojo.estudojava.javacore.Oexception.exception.dominio;

public class LoginIvalidoException extends Exception{
    public LoginIvalidoException() {
        super("Login inválido");
    }

    public LoginIvalidoException(String message) {
        super(message);
    }
}
