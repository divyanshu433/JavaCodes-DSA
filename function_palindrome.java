import java.util.*;

public class function_palindrome {

    public static boolean isPalindrome (int n){
        int num = n;
        int rev_num = 0;
        boolean palindrome = false;

        while (n > 0){
            int lst = n % 10;
            n = n / 10;
            rev_num = (rev_num*10) + lst;
        }

        if(rev_num == num){
            palindrome = true;
        }
        
        return palindrome;

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        System.out.print(isPalindrome(num));
        sc.close();
    }
}
