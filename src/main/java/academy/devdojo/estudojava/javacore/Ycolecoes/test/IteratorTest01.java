package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
//        List<Manga> mangas = new ArrayList<>();
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Dragon balll Z", 11.2, 2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
