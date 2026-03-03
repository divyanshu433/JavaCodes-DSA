import java.util.Scanner;

public class string_10_anagrams {

    public static boolean Anagrams (String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        int count = 0;  
        for(int i = 0; i < str1.length(); i++){
            int j = 0;
            while(j < str1.length()){
                if (str1.charAt(i) == str2.charAt(j)){
                    count++;
                }
                j++;
            }
        }
        if(count == str1.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1 : ");
        String str1 = sc.next();
        System.out.print("Enter string 2 : ");
        String str2 = sc.next();

        System.out.print("Is Anagrams : " + Anagrams(str1, str2));

        sc.close();
    }
}
