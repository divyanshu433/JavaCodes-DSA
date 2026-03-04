import java.util.Scanner;

public class bit_man_10_fast_expo {

    public static int fast_expo (int a, int n){
        int ans = 1;

        while (n > 0){
            if ((n & 1) == 1){
                ans *= a; 
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter power : ");
        int pow = sc.nextInt();

        System.out.println(fast_expo(num, pow));

        sc.close();
    }
}
