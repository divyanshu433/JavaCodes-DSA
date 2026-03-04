import java.util.Scanner;

public class bit_man_14_ipper_to_lower {

    public static void upper_to_lower (){
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char) (ch | ' ') + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        upper_to_lower();

        sc.close();
    }
}
