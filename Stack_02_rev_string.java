import java.util.*;

public class Stack_02_rev_string {

    public static String reverseString(String str){
        Stack <Character> stck = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            stck.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while(!stck.isEmpty()){
            char s = stck.pop();
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse : ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));
    }
}
