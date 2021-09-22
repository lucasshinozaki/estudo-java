package academy.devdojo.estudojava.javacore.Csobrecargametodos.test;

import academy.devdojo.estudojava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive", "TV", 12);
        anime.init("Akuma Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
