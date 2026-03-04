import java.util.Scanner;

public class bit_man_06_clear_i_bits {

    public static int clear_i_bit (int num, int place){
        int bitmask = (-1 << place);
        return num & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter place to set bit : ");
        int place = sc.nextInt();

        System.out.println(clear_i_bit(num, place));

        sc.close();
    }
}
