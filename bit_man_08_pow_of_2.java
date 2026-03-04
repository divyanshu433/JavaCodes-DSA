import java.util.Scanner;

public class bit_man_08_pow_of_2 {
    public static boolean pow_0f_2 (int num){
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println(pow_0f_2(num));

        sc.close();
    }
}
