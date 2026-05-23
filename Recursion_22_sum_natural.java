import java.util.Scanner;

public class Recursion_22_sum_natural {
    public static int sum_natural_num(int n){
        if(n == 1){
            return 1;
        }
        return sum_natural_num(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println(sum_natural_num(n));
        sc.close();
    }
}
