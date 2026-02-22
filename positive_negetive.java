import java.util.*;

public class positive_negetive{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your number : ");
        float num = sc.nextFloat();

        if(num >= 0){
        System.out.print("POSITIVE NUMBER");
        }
        else{
        System.out.print("NEGATIVE NUMBER");
        }
        sc.close();

    }
}