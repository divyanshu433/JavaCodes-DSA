import java.util.Scanner;

public class bit_man_13_add_1_to_num {

    public static int add_one (int num){
        return -(~num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println(add_one(num));

        sc.close();
    }
}
