import java.util.InputMismatchException;
import java.util.Scanner;

public class studentresultt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();

            if (numSubjects <= 0) {
                throw new ArithmeticException("Invalid input! Number of subjects cannot be zero or negative.");
            }

            int total = 0;
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new Exception("Invalid marks! Marks must be between 0 and 100.");
                }

                total = total + marks;
            }

            double average = total / (double) numSubjects;
            System.out.println("Total marks: " + total);
            System.out.println("Average marks: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
} 
