public class Queue_02 {

    static class Node{
        int data;
        Node next;
        
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(head == null){
                System.out.println("Queue is EMPTY");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            if(tail == head){
                head = tail = null;
                return val;
            }
            head = head.next;
            return val;
        }

        public static int peek(){
            if(head == null){
                System.out.println("Queue is EMPTY");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
