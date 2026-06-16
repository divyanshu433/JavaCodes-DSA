import java.util.Deque;
import java.util.LinkedList;

public class Queue_09_stack_using_deque {

    static class Stack{
        Deque <Integer> deque = new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is EMPTY");
                return Integer.MIN_VALUE;
            }
            return deque.removeLast();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is EMPTY");
                return Integer.MIN_VALUE;
            }
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

        System.out.println(s.pop());
        
    }
}
