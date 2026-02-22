import java.util.*;

public class function_prime_in_range {

    public static boolean Check_prime(int n){
        boolean is_prime = true;

        if((n == 0) || (n == 1)){
            is_prime = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                is_prime = false;
                break;
            }
        }

        return is_prime;
    }

    public static void prime_in_range (int num){
        for (int i = 2; i<= num; i++){
            if(Check_prime(i) == true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        prime_in_range(num);

        sc.close();
    }
}
