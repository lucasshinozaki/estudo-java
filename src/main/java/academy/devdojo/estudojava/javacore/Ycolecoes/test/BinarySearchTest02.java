package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Dragon balll Z", 11.2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Attack on titan", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
