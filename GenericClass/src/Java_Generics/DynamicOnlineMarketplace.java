package Java_Generics;

class Product<T> {
    T category;
    double price;

    Product(T c, double p) {
        category = c;
        price = p;
    }
}

class BookCategory {
}

public class DynamicOnlineMarketplace {
    static <T extends Product<?>> void applyDiscount(T p, double per) {
        p.price -= p.price * per / 100;
    }

    public static void main(String[] args) {
        Product<BookCategory> p = new Product<>(new BookCategory(), 500);
        applyDiscount(p, 10);
        System.out.println(p.price);
    }
}
