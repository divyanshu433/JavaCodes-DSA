import java.util.*;

public class function_bin_to_dec {

    public static int bin_to_dec (int n){
        int dec = 0;
        int pow = 0;
        
        while (n > 0){
            double lst = n % 10;
            n = n/10;

            double prod = lst*Math.pow(2, pow);
            dec += prod;
            pow++;
        }
        return dec;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number in binary : ");
        int num = sc.nextInt();

        System.out.print("Decimal value is : " + bin_to_dec(num));

        sc.close();
    }
}
