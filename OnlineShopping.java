import java.util.Scanner;
import java.util.InputMismatchException;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (price <= 0) {
                throw new Exception("Invalid product price! Price must be greater than 0.");
            }

            if (quantity <= 0) {
                throw new Exception("Invalid quantity! Quantity must be greater than 0.");
            }

            if (discount < 0 || discount > 100) {
                throw new Exception("Invalid discount percentage! Must be between 0 and 100.");
            }

            double bill = price * quantity;
            double finalAmount = bill - (bill * discount / 100);

            System.out.println("Total bill: " + bill);
            System.out.println("Final amount after discount: " + finalAmount);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if (payment < finalAmount) {
                throw new Exception("Insufficient payment! You need to pay at least " + finalAmount);
            }

            System.out.println("Payment successful!");
            System.out.println("Change returned: " + (payment - finalAmount));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
} 
