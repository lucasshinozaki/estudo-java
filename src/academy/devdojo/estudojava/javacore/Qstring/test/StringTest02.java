package academy.devdojo.estudojava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy";
        String numeros = "012345";

        System.out.println("Alguns métodos do String: ");

        System.out.println(nome.charAt(0)); //Posição da letra
        System.out.println(nome.length()); //Quantidade
        System.out.println(nome.replace("f", "l")); //Troca os f por l
        System.out.println(nome.toUpperCase()); //Maiuscula
        System.out.println(nome.toLowerCase()); //Minuscula

        System.out.println(numeros.length());
        System.out.println(numeros.substring(3, numeros.length())); //retorna da posição inicial até a final -1
        System.out.println(nome.trim()); //remove os valores em branco do começo e do fim da string
    }
}
