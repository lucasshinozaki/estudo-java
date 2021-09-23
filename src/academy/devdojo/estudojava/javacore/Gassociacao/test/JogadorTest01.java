package academy.devdojo.estudojava.javacore.Gassociacao.test;

import academy.devdojo.estudojava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

//        Jogador[] jogadores = new Jogador[3];
//        Jogador[] jogadors = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
