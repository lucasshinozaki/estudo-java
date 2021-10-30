package academy.devdojo.estudojava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); //trabalha com nano segundos, está dividido em duas variaves
        System.out.println(now); //Z - zulu time, horario neutro do mundo
        System.out.println(LocalDateTime.now()); //T - ponto de parada do dia para o tempo
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // a cada 999.999.999 add 1 getEpochSecond
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
