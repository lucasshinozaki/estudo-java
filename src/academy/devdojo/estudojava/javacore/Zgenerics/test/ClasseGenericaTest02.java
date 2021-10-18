package academy.devdojo.estudojava.javacore.Zgenerics.test;

import academy.devdojo.estudojava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.estudojava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês....");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
