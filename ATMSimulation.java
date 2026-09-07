import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 4321;
        double balance = 10000.00;
        int attempts = 0;
        boolean authenticated = false;

        System.out.println("=== Welcome to the ATM ===");
        
        while (attempts < 3) {
            System.out.print("Enter 4-digit PIN: ");
            int enteredPin = scanner.nextInt();
            attempts++;

            if (enteredPin == correctPin) {
                authenticated = true;
                break;
            } else {
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }

        if (!authenticated) {
            System.out.println("Maximum attempts reached. Account locked!");
            scanner.close();
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmt = scanner.nextDouble();
                    if (withdrawAmt > 0 && withdrawAmt <= balance) {
                        balance -= withdrawAmt;
                        System.out.println("Please collect your cash. Remaining Balance: ₹" + balance);
                    } else if (withdrawAmt > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmt = scanner.nextDouble();
                    if (depositAmt > 0) {
                        balance += depositAmt;
                        System.out.println("Amount deposited. New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
