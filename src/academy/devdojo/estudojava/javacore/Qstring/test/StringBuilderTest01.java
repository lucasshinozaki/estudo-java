package academy.devdojo.estudojava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas Shinozaki";
        nome.concat(" Dev Dojo");
        nome = nome.substring(0, 3);
        System.out.println(nome);

        // Funciona para StringBuffer da mesma forma
        StringBuilder sb = new StringBuilder("Lucas Shinozaki"); // Mutável, tamanho padrão 16
        sb.append(" DevDojo").append(" Acadaemy");
        sb.reverse(); //reverte a ordem do stringbuilder
        sb.reverse();

        sb.delete(0,3); // deleta do inicial até final -1

        System.out.println(sb.toString());


    }
}
