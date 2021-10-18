package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Dragon balll Z", 11.2, 2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
