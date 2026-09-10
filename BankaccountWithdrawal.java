import java.util.Scanner;
import java.util.InputMismatchException;

public class BankaccountWithdrawal {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int balance=5000;
        try{
            System.out.println("Enter amount to withdraw : ");
            int amt=ss.nextInt();
            if(amt<0){
                throw new Exception("Amount should be greater than 0");
            }
            if(amt>balance){
                throw new Exception("Insufficient amount! remaining balance : "+balance);
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input, please enter a number");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            ss.close();
        }
    }
}
