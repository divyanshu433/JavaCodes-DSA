import java.util.*;

public class function_sum_of_digits {

    public static int Sum_of_Digits (int n){
        int sum = 0;
        while (n > 0){
            int lst = n % 10;
            n = n / 10;
            sum += lst;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to get sum : ");
        int num = sc.nextInt();

        System.out.print("The sum is : " + Sum_of_Digits(num));

        sc.close();
    }
}
