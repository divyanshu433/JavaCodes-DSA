import java.util.Scanner;
import java.util.Stack;

public class Stack_07_duplicate_parentheses {

    public static boolean dup_parentheses(String str){
        Stack <Character> stk = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr != ')'){
                stk.push(curr);
            }
            else{
                int count = 0;
                while(stk.peek() != '('){
                    stk.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                stk.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parentheses to check : " );
        String str = sc.nextLine();

        System.out.println(dup_parentheses(str));
        sc.close();
    }
}
