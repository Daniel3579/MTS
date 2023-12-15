package HW_2;

import java.math.BigDecimal;

/**
 * The class contains methods for obtaining prices with and without discount
 */
public final class PriceListMethods {

    /**
     * Print price with discount
     *
     * @param p Product class object
     */
    static void getPriceWithDiscount(Product p) {
        BigDecimal result = BigDecimal.valueOf(p.amount).multiply(p.price.multiply(BigDecimal.ONE.subtract(p.discount)));
        System.out.printf("Price with discount: %.2f\n", result);
    }

    /**
     * Print price without discount
     *
     * @param p Product class object
     */
    static void getPriceWithoutDiscount(Product p) {
        BigDecimal result = BigDecimal.valueOf(p.amount).multiply(p.price);
        System.out.printf("Price without discount: %.2f\n", result);
    }
}
