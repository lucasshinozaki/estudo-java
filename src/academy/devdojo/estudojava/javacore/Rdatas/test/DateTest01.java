package academy.devdojo.estudojava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Está quase inteira absoleta(depreciado)
        Date date = new Date(1633631783437L); // long 100000ms desde 1970
        //System.out.println(date.getTime()); //long que representa o dia de hj 1633631783437
        date.setTime(date.getTime() + 3_600_000); // adicionar 1 hora

        System.out.println(date);
    }
}
