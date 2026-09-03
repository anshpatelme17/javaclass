import java.util.Scanner;
public class case1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int []marks =new int[5];
        int total=0;
        System.out.println("Marks of 5 subjects scored by "+name+" out of 100 :");
        for(int i=0;i<5;i++){
            marks[i]=s.nextInt();
            total+=marks[i];
        }
        int percent=(total/5);
        if(percent>=90){
            System.out.println("A+");
        }
        else if(percent>=80 && percent<90){
            System.out.println("A");
        }
        else if(percent>=70 && percent<80){
            System.out.println("B");
        }
        else if(percent>=60 && percent<70){
            System.out.println("C");
        }
        else if(percent>=50 && percent<60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        if(percent<50){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
        s.close();
    }
}
