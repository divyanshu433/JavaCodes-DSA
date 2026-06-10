import java.util.*;
public class Stack_01_push_at_bottom {

    public static void pushAtBottom (Stack<Integer> stck, int data){
        if(stck.isEmpty()){
            stck.push(data);
            return;
        }
        int top = stck.pop();
        pushAtBottom(stck, data);
        stck.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> stck = new Stack<>();
        stck.push(3);
        stck.push(2);
        stck.push(1);

        pushAtBottom(stck, 4);

        while(!stck.isEmpty()){
            System.out.println(stck.pop());
        }
    }
}
