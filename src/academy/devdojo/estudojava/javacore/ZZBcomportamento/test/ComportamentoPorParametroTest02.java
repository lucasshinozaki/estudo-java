package academy.devdojo.estudojava.javacore.ZZBcomportamento.test;

import academy.devdojo.estudojava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.estudojava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green")); //Lambda da subclasse abaixo;
        System.out.println(greenCars);
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//        System.out.println(greenCars);
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        System.out.println(redCars);
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
