package academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.estudojava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
