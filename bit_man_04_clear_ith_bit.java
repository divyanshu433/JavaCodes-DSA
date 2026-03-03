import java.util.Scanner;

public class bit_man_04_clear_ith_bit {

    public static int clear_ith_bit (int num, int place){
        int bitmask = (1 << place);
        return num & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numberk : ");
        int num = sc.nextInt();

        System.out.print("Enter place to set bit : ");
        int place = sc.nextInt();

        System.out.println(clear_ith_bit(num, place));

        sc.close();
    }
}
