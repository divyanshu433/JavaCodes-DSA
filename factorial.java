import java.util.*;

public class factorial{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to get factorial : ");
        long num = sc.nextLong();
        long fact = 1;
       
        for(int i = 1; i <= num; i++){
        fact *= i;
        }
        
        System.out.print("Factorial is : "+fact);
        sc.close();
    }
}