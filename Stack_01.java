import java.util.*;
public class Stack_01 {

    static class StackAR{
        static ArrayList <Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
             if(isEmpty()){
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }
    
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static class StackLL{
        static Node head = null;
    
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }


        public static int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }

            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
            StackAR s = new StackAR();

            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
            
            System.out.println(s.peek());

            StackLL sl = new StackLL();

            sl.push(1);
            sl.push(2);
            sl.push(3);
            sl.push(4);

            while(!sl.isEmpty()){
                System.out.println(sl.peek());
                sl.pop();
            }
            
            System.out.println(sl.peek());
        }
}
