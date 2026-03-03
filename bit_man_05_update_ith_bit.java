import java.util.Scanner;

public class bit_man_05_update_ith_bit {

    public static int clear_ith_bit (int num, int place){
        int bitmask = (1 << place);
        return num & bitmask;
    }

    public static int set_ith_bit (int num, int place){
        int bitmask = 1<<place;
        return num | bitmask;
    }

    public static int update_ith_bit (int num, int value, int place){
        if (value == 0){
            return clear_ith_bit(num, place);
        }
        else{
            return set_ith_bit(num, place);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter value : ");
        int value = sc.nextInt();

        System.out.print("Enter place to set bit : ");
        int place = sc.nextInt();

        System.out.println(update_ith_bit(num, value, place));

        sc.close();
    }
}
