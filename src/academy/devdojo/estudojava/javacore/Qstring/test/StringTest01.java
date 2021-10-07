package academy.devdojo.estudojava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //toda String em java é imutavel
        String nome = "Lucas"; //String constant pool
        String nome2 = "Lucas";

        nome = nome.concat(" Shinozoaki"); // nome += " Shinozaki"
        System.out.println(nome);
        System.out.println(nome == nome2); // compara as referências

        // 1 - variavel de referência
        // 2 - objeto do tipo string
        // 3 - uma string na pool
        String nome3 = new String("Lucas"); //pasando por referencia do pool de string, dentro do heap, fora do pool
        System.out.println(nome2 == nome3); // lugares diferentes da mémoria
        System.out.println(nome2 == nome3.intern());//comparando dentro do pool de string .intern()
    }
}
