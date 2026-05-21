import java.util.Scanner;

public class Recursion_21_factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }

        return fact(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
