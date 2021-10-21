package academy.devdojo.estudojava.javacore.ZZClambdas.test;

import academy.devdojo.estudojava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.estudojava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        AnimeComparators animeComparators = new AnimeComparators();
//        AnimeComparators animeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimerComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimerComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFuncttion = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFuncttion2 = Anime::new;

        System.out.println(animeBiFuncttion2.apply("Super campeões", 36));
    }
}
