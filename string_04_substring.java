import java.util.*;

public class string_04_substring {

    public static String substring (String str, int si, int ei){
        String substr = "";
        for (int i = si; i <= ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        System.out.print("Enter starting index : ");
        int si = sc.nextInt();

        System.out.print("Enter ending index : ");
        int ei = sc.nextInt();

        System.out.println(substring(str, si, ei));

        sc.close();
    }
}
