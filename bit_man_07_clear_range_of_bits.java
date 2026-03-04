import java.util.Scanner;

public class bit_man_07_clear_range_of_bits {

    public static int clear_range_of_bits (int num, int place, int place2){
        int a = -1 << (place2 + 1);
        int b = (1 << place) - 1;
        int bitmask = a | b;
        return num & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter starting place to clear bit : ");
        int place = sc.nextInt();

        System.out.print("Enter ending place to clear bit : ");
        int place2 = sc.nextInt();

        System.out.println(clear_range_of_bits(num, place, place2));

        sc.close();
    }
}
