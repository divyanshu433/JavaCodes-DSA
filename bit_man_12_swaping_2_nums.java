import java.util.Scanner;

public class bit_man_12_swaping_2_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a : " + a);
        System.out.println("b : " + b );


        sc.close();
    }
}
