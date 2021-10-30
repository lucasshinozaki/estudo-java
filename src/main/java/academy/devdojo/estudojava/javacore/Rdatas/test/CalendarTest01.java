package academy.devdojo.estudojava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){//Primeiro dia da semana
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //DIA DA SEMANA
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //DIA DO MES
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); //DIA DO ANO
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //DIAS PARA O FINAL DE SEMANA

        c.add(Calendar.DAY_OF_MONTH, 2); // se passar o ano, altera o ano
        c.add(Calendar.HOUR, 12); // se passar um dia altera o dia
        c.roll(Calendar.HOUR, 12); // se passar o dia, não muda para outro

        Date date = c.getTime();
        System.out.println(date);
    }
}
