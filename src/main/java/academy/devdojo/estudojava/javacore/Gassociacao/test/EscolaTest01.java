package academy.devdojo.estudojava.javacore.Gassociacao.test;

import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
