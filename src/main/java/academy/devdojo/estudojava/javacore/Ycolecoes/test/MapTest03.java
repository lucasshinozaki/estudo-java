package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Lucas Shinozaki");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Bersek", 19.9);
        Manga manga2 = new Manga(1L, "Hellsing Ultimate", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Dragon balll Z", 11.2);
        Manga manga5 = new Manga(2L, "Attack on titan", 2.99);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
            System.out.println("------" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("---------------" + manga.getNome());
            }

        }

    }
}
