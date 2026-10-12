class Product {
    String name;
    int id;
    double price;
    int qty;

    Product(String name, int id, double price, int qty) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty;
    }

    void displayBill() {
        double subtotal = price * qty;
        double discount = (subtotal >= 10000) ? subtotal * 0.15 : (subtotal >= 5000) ? subtotal * 0.10 : (subtotal >= 1000) ? subtotal * 0.05 : 0;
        
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + (subtotal - discount));
    }
}

public class Q9Product_discount {
    public static void main(String[] args) {
        new Product("mouse", 501, 2000, 3).displayBill();
    }
}