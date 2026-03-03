import java.util.Scanner;

public class string_09_chk_lowercase_vowels {

    public static int lowercase_vowels (String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to check : ");
        String str = sc.next();

        System.out.println("Lower case vowels are : " + lowercase_vowels(str));

        sc.close();
    }
}
