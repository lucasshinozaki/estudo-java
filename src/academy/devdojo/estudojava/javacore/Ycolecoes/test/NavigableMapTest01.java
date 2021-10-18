package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //lower < | floor <= | higher > | ceiling >=
        System.out.println(map.headMap("C")); //Todos que vão vir antes do C
        System.out.println(map.headMap("C").remove("A")); //Todos que vão vir antes do C, remove A
        System.out.println(map.headMap("C", true)); //Todos que antes do C, incluindo ele
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));

    }
}
