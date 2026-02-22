import java.util.*;

public class function_prime {

    public static boolean Ckeck_prime(int n){
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

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        System.out.print("Is prime : " + Ckeck_prime(num));

        sc.close();
    }
}
