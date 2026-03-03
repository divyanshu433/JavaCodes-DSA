import java.util.Scanner;

public class bit_man_02_get_ith_bit {

    public static int get_ith_bit (int num, int place){
        int bitmask = 1 << place;
        if((num & bitmask) == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        System.out.print("Enter place to get bit : ");
        int place = sc.nextInt();

        System.out.println(get_ith_bit(num, place));

        sc.close();
    }
}
