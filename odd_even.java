import java.util.*;

public class odd_even{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("EVEN");
        }
        else{
             System.out.println("ODD");
        }
        sc.close();
    }
}