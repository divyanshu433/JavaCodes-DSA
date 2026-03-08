import java.util.Scanner;

public class Recursion_factorial {

    public static int fact (int n){
          if ((n == 0) || (n == 1)) {
            return 1;
          }
          return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to calc : ");
        int num = sc.nextInt();

        System.out.println("Factorial is : " + fact(num));

        sc.close();
    }
}
