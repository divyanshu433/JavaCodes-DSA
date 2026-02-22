import java.util.*;

public class calculator{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st operand : ");
        int a = sc.nextInt();

        System.out.print("Enter 1st operand : ");
        int b = sc.nextInt();

        System.out.print("1 for SUM \n2 for DIFF \n3 for MULTIPLY \n4 for DIVIDE \n5 for MODULO \n");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice){
            case (1):
                System.out.print("The SUM is : "+(a+b));
                break;

            case (2):
                System.out.print("The DIFF is : "+(a-b));
                break;

            case (3):
                System.out.print("The MULTIPLY is : "+(a*b));
                break;
            
            case (4):
                System.out.print("The DIVIDE is : "+(a/b));
                break;
            
            case (5):
                System.out.print("The REMAINDER is : "+(a%b));
                break;
            
            default:
                System.out.print("INVALID INPUT");
                break;
            

        }
        sc.close();


    }
}