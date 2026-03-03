import java.util.Scanner;

public class bit_manuplation_01 {

    public static void Odd_or_even (int num){
        int bitmask = 1;
        if((num & bitmask) > 0){
            System.out.println("ODD NUMBER");
        }
        else{
            System.out.println("EVEN NUMBER");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to ckeck : ");
        int num = sc.nextInt();


        Odd_or_even(num);
        sc.close();
    }
}
