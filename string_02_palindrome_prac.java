import java.util.Scanner;

public class string_02_palindrome_prac {

    public static boolean is_palindrome (String str){
        int start = 0;
        int end = str.length() - 1;
        while (start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter to check : ");
        String str = sc.next();

        if (is_palindrome(str) == true){
            System.out.println("PALINDROME");
        }

        else{
            System.out.println("NOT PALINDROME");
        }

        sc.close();
    }
}
