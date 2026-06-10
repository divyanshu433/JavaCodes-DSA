import java.util.Stack;

public class Stack_03_rev_stack {
    public static void revStack (Stack<Integer> stck){
        if(stck.isEmpty()){
            return;
        }
        int top = stck.pop();
        revStack(stck);
        pushAtBottom(stck, top);
    }

    public static void pushAtBottom (Stack<Integer> stck, int data){
        if(stck.isEmpty()){
            stck.push(data);
            return;
        }
        int top = stck.pop();
        pushAtBottom(stck, data);
        stck.push(top);
    }
    
    public static void printSack(Stack<Integer> stck){
        while(!stck.isEmpty()){
            System.out.print(stck.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack <Integer> stck = new Stack<>();
        stck.push(1);
        stck.push(2);
        stck.push(3);

        revStack(stck);
        printSack(stck);

    }
}
