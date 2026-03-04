import java.util.Scanner;

public class bit_man_11 {

    public static int expo (int num){
        return (num^num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println(expo(num));

        sc.close();
    }
}
