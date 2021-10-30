package academy.devdojo.estudojava.javacore.ZZEStreams.test;

import academy.devdojo.estudojava.javacore.ZZEStreams.dominio.Category;
import academy.devdojo.estudojava.javacore.ZZEStreams.dominio.LightNovel;
import academy.devdojo.estudojava.javacore.ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.estudojava.javacore.ZZEStreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.estudojava.javacore.ZZEStreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        //Grupamento por categoria e suas estatisticas

        Map<Category, DoubleSummaryStatistics> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(getLightNovelPromotionFunction(), Collectors.toSet())
                ));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(getLightNovelPromotionFunction(),
                                Collectors.toCollection(LinkedHashSet::new))
                ));
        System.out.println(collect2);
    }

    private static Function<LightNovel, Promotion> getLightNovelPromotionFunction() {
        return ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
