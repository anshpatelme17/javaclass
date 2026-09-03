import java.util.Scanner;
public class case2 {
    private String accno;
    private String accholdername;
    private double balance;
    public case2(String accno,String accholdername,double balance){
        this.accno=accno;
        this.accholdername=accholdername;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited");
    }
    public void withdraw(double deduct){
        if(deduct<balance){
            balance-=deduct;
            System.out.println("Withdrawn");
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public void displayBalance(){
        System.out.println("Amount remaining : "+balance);
    }
    public static void main(String[] args){
        case2 acc= new case2("Ansh10acc","Ansh",100000.00);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        double a=s.nextDouble();
        acc.deposit(a);
        System.out.println("Enter withdraw amount:");
        double b=s.nextDouble();
        acc.withdraw(b);
        acc.displayBalance();
    }
}
