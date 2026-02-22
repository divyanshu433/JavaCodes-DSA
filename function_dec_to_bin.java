import java.util.*;

public class function_dec_to_bin {

    public static int dec_to_bin (int dec_num){
        int num = dec_num;
        int bin_num = 0;
        int place = 1;

        while(num > 0){
            int rem = num % 2;
            num = num / 2;
            bin_num = bin_num + (rem*place);
            place = place * 10;
        }

        return bin_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Decimal number : ");
        int num = sc.nextInt();

        System.out.print("Binary number is : " + dec_to_bin(num));

        sc.close();
    }
}
