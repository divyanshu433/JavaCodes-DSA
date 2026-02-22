import java.util.*;

public class whileloop2{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to print : ");
        int num = sc.nextInt();

        int i = 1;

        while (i <= num){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}