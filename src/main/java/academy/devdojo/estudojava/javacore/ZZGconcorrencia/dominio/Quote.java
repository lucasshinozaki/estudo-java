package academy.devdojo.estudojava.javacore.ZZGconcorrencia.dominio;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// storeName:price:discountCode
public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     *
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        Locale localeBR = new Locale("pt","BR");
        String[] values = value.split(":");
        return new Quote(values[0], parseDouble(values[1], localeBR), Discount.Code.valueOf(values[2]));
    }

    public static double parseDouble(String s, Locale locale) {
        if (s == null || s.isEmpty()) {
            return Double.NaN;
        }
        try {
            return NumberFormat.getNumberInstance(locale).parse(s).doubleValue();
        } catch (ParseException ex) {
            try {
                return NumberFormat.getNumberInstance(Locale.US).parse(s).doubleValue();
            } catch (ParseException ex1) {
                return Double.NaN;
            }
        }
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}