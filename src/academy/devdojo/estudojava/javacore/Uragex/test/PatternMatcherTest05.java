package academy.devdojo.estudojava.javacore.Uragex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . Ex: 1.3 tudo que pode ter entre 1 e 3 123, 133, 1@3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hootmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email válido:");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
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
