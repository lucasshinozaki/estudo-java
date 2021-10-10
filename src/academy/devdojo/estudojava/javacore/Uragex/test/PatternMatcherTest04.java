package academy.devdojo.estudojava.javacore.Uragex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //Texto, todas as ocorencias de numeros hex no texto
        // QUANTIFICADORES
        // ? Zero ou Uma
        // * Zero ou mais
        // * uma ou mais
        // {n,m} de n até m
        // () - agrupamento
        // | - ou
        // | o(v|c)o ovo | oco
        // $ - fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
