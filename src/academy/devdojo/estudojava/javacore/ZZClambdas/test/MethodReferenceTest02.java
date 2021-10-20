package academy.devdojo.estudojava.javacore.ZZClambdas.test;

import academy.devdojo.estudojava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.estudojava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));
//        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
