import java.util.Scanner;

public class Recursion_23_fibonacci {
    public static int fibo(int n){
        if ((n == 0) || (n == 1)){
            return n;
        }

        return fibo(n - 1) + fibo (n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println(fibo(n));
        sc.close();
    }
}
