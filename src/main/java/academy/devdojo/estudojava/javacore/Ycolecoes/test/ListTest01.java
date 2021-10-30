package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Alberto");
        nomes2.add("Souza");
        nomes2.add("Shinozaki");
        //System.out.println(nomes.remove("lucas"));

        nomes.addAll(nomes2);

        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("----------------------");

        nomes.add("Shinozaki");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
