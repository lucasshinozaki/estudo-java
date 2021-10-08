package academy.devdojo.estudojava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFornatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Amsterdam' dd 'de' MMMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 08 de outubro de 2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
