package academy.devdojo.estudojava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 3200;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "Lucas";
       // var nome2 = "Goku" Versão 10 do java



        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é " + nome);
    }
}
