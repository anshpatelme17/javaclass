import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println(productName + " | Qty: " + quantity + " | Price: ₹" + price + " | Total: ₹" + getTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product(1, "Wireless Mouse", 800.00, 2));
        cart.add(new Product(2, "Mechanical Keyboard", 3500.00, 1));
        cart.add(new Product(3, "USB-C Cable", 400.00, 3));

        double totalBill = 0;
        System.out.println("--- Cart Items ---");
        for (Product product : cart) {
            product.displayProduct();
            totalBill += product.getTotalCost();
        }

        System.out.println("-------------------");
        System.out.println("Subtotal: ₹" + totalBill);

        if (totalBill > 5000) {
            double discount = totalBill * 0.10;
            totalBill -= discount;
            System.out.println("Discount (10%): -₹" + discount);
        } else {
            System.out.println("Discount: ₹0.00");
        }

        System.out.println("Final Bill Amount: ₹" + totalBill);
    }
}
