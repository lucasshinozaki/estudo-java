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

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        // Tree Set, não utiliza o equals para ver se dois object são iguais
        // Utiliza o compareTo, no caso foi sobeescrito então não permite dois elementos com dois nomes iguais
        // Alterando com comparaTo para MangaPrecoComparator
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Dragon balll Z", 11.2, 2));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(2L, "Attack on titan", 2.99, 0));

        // Deixando a ordem inversa
        for (Manga manga: mangas.descendingSet()){
            System.out.println(manga);
        }

        Manga yuyu = new Manga(5L, "Yuyu Hakusho", 8, 0);

        //lower < floor <= higher > ceiling >=
        System.out.println("=================================");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //Retira o primeiro elemento da lista
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); //Retira o ultimo elemento da lista
        System.out.println(mangas.size());
    }
}
