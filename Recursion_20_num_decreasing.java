import java.util.Scanner;

public class Recursion_20_num_decreasing {
    public static void number_inc(int n){
        if(n == 0){
            System.out.print(n + " ");
            return;
        }
        number_inc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        number_inc(n);
    }
}
