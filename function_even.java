import java.util.*;

public class function_even {

    public static boolean isEven (int n){
        boolean even = false;

        if (n % 2 == 0){
            even = true;
        }
        return even;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        System.out.print(isEven(num));
        
        sc.close();
    }
    
}
