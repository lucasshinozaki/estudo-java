package academy.devdojo.estudojava.javacore.Ycolecoes.test;

import academy.devdojo.estudojava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "Lucas Shinozaki";
//        String nome2 = new String("Lucas Shinozaki");
//        //System.out.println(nome == nome2); //Não funciona
//        System.out.println(nome.equals(nome2));
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
