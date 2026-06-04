public class Linked_list_01_intro {

    public class Node{
        int data;
        Node next;

        public Node(){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        // Step - 1 (Create new Node)
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step - 2 (newNode next = head)
        newNode.next = head;  // Link
        // Step - 3 (head = newNode)
        head = newNode;
    }

    public void addLast(int data){
        }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Linked_list_01_intro ll = new Linked_list_01_intro();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}