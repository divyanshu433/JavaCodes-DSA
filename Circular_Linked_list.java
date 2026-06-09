public class Circular_Linked_list {

    class Node(){
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newnode;
            head.next = head;
            size++;
            return;
        }

        Node temp = head;
        newNode.next = temp;
        head.next = newNode;
        head = newNode;
        return;
    }


    public static void main(String[] args) {
        
    }
}
