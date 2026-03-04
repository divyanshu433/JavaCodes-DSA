import java.util.Scanner;

public class bit_man_09_count_set_bits {

    public static int set_bits(int num){
        int count = 0;
        while (num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println("no. of set bits : " + set_bits(num));

        sc.close();
    }
}
