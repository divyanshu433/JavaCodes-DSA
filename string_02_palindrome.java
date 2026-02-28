import java.util.*;

public class string_02_palindrome {

    public static boolean palindrome (String str){
        int n = str.length();

        for (int i = 0; i < n; i++){
            if (str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter String to check palindrome : ");
        String str = sc.next();

        System.out.println(palindrome(str));

        sc.close();
    }
}
