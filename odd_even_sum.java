import java.util.*;

public class odd_even_sum{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the no. of numbers : ");
        int n = sc.nextInt();
        int even = 0,odd = 0;

        for(int i = 1; i <= n; i++){
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            if(num % 2 == 0){
                even += num;
            }
            else{
                odd += num;
            }
        }
        System.out.println("SUM of EVEN numbers is : "+even);
        System.out.println("SUM of ODD numbers is : "+odd);
        sc.close();
    }
}