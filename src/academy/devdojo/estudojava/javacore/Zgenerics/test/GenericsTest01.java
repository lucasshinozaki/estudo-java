package academy.devdojo.estudojava.javacore.Zgenerics.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erauser
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        add(lista, new Consumidor("Midoriya"));

        for (Object o : lista){
            System.out.println(o);
        }
    }

    private static void add(List<String> lista, Consumidor consumidor){
        lista.add(consumidor.getNome());
    }
}
