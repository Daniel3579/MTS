package HW_2;

import java.math.BigDecimal;

/**
 * The class tests the correctness of a product price list
 */
public class TestProductPriceListCorrectness {

    public static void main(String[] args) {
        Product p1 = new Product(3, BigDecimal.valueOf(412.49), BigDecimal.valueOf(0.0075));
        Product p2 = new Product(5, BigDecimal.valueOf(326.39), BigDecimal.valueOf(0.42575));
        Product p3 = new Product(4, BigDecimal.valueOf(183.99), BigDecimal.valueOf(0.591));

        PriceListMethods.getPriceWithDiscount(p1);
        PriceListMethods.getPriceWithoutDiscount(p1);

        PriceListMethods.getPriceWithDiscount(p2);
        PriceListMethods.getPriceWithoutDiscount(p2);

        PriceListMethods.getPriceWithDiscount(p3);
        PriceListMethods.getPriceWithoutDiscount(p3);
    }
}
