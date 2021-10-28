package academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTACE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTACE();
        System.out.println(aircraft.bookSeat(seat));
    }

}
