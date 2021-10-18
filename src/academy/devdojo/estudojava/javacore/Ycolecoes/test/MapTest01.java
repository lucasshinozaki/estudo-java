package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Não pode ter chaves duplicadas
        Map<String, String> map = new HashMap<>();
//        Map<String, String> map2 = new LinkedHashMap<>(); //Mantem na ordem de entrada
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); //Só add se já não existir
        map.putIfAbsent("vc2", "você");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("--------------------------------");

        for (String values : map.values()) {
            System.out.println(values);
        }

        System.out.println("--------------------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
