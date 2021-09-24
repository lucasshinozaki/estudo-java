package academy.devdojo.estudojava.javacore.Gassociacao.test;

import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras, 1059");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
