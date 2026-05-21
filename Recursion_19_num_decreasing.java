import java.util.Scanner;

public class Recursion_19_num_decreasing {

    public static void number_dec(int n){
        if(n == 0){
            System.out.print(0);
            return;
        }
        System.out.print(n + " ");
        number_dec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        number_dec(n);
    }
}
