package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        // Não aceitta duplicado, e segue a regra do compareTo
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Dragon balll Z", 11.2, 2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
