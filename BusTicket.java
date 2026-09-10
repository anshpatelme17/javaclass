import java.util.Scanner;
import java.util.InputMismatchException;
public class BusTicket {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        int av=20;
        try{
            System.out.print("Passenger age : " );
            int age=ss.nextInt();
            System.out.print("No. of seats to book : ");
            int seats=ss.nextInt();
            if(age<=0){
                throw new Exception("Invalid age! must be greater than 0");
            }
            if(seats<=0){
                throw new Exception("Invalid seat! must be greater than 0");
            }
            if(seats>av){
                throw new Exception("Insufficient seats");
            }
            System.out.println("Booking Successful!");
            System.out.println("Age: "+age);
            System.out.println(seats+" booked");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! enter number only");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            ss.close();
        }
    }
}
