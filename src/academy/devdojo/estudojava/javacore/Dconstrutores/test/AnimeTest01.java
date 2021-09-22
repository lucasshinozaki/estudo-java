package academy.devdojo.estudojava.javacore.Dconstrutores.test;

import academy.devdojo.estudojava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyou", "TV", 12, "Ação", "Production 16");
        anime.imprime();

    }
}
