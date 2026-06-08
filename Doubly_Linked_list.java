import org.w3c.dom.Node;

public class Doubly_Linked_list {

    public class Node{
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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }


    public int removeFirst(){
        if(head == null){
            System.out.println("Doubly Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    public int removeLast(){
        if(head == null){
            System.out.println("Doubly Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(head.next == null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        int val = temp.data;
        tail = temp.prev;
        tail.next = null;
        size--;
        return val;

    }


    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;

            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        Doubly_Linked_list dLL = new Doubly_Linked_list();

        dLL.addFirst(3);
        dLL.addFirst(2);
        dLL.addFirst(1);
        dLL.printDLL();
        System.out.println("Size = " + size);

        dLL.addLast(4);
        dLL.addLast(5);
        dLL.addLast(6);
        dLL.printDLL();
        System.out.println("Size = " + size);

        dLL.removeFirst();
        dLL.printDLL();
        System.out.println(size);

        dLL.removeLast();
        dLL.printDLL();
        System.out.println(size);

        dLL.reverse();
        dLL.printDLL();
    }
}
