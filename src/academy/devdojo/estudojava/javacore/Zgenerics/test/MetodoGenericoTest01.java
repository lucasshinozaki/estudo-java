package academy.devdojo.estudojava.javacore.Zgenerics.test;

import academy.devdojo.estudojava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcosList = criarArrayComUmObjeto(new Barco(("Canoa Marota")));
        System.out.println(barcosList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}
