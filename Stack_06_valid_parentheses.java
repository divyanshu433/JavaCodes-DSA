import java.util.Scanner;
import java.util.Stack;

public class Stack_06_valid_parentheses {

    public static boolean valid_parentheses(String parentheses){
        Stack <Character> stk = new Stack<>();
        for(int i = 0; i < parentheses.length(); i++){
            char curr = parentheses.charAt(i);
            if(curr == '{' || curr == '[' || curr == '('){
                stk.push(curr);
            }
            else if(!stk.isEmpty()){
                if((stk.peek() == '{' && curr == '}') || 
                    (stk.peek() == '[' && curr == ']') ||
                    (stk.peek() == '(' && curr == ')')){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parentheses to check : " );
        String parentheses = sc.nextLine();

        System.out.println(valid_parentheses(parentheses));
        sc.close();
    }
}
