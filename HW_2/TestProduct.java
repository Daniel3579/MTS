package MTS.HW_1;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product(3, 412.49F, 0.0075F);
        Product p2 = new Product(5, 326.39F, 0.42575F);
        Product p3 = new Product(4, 183.99F, 0.591F);

        Product.getPriceList(p1);
        Product.getPriceList(p2);
        Product.getPriceList(p3);
    }
}
