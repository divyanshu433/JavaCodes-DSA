public class Linked_list_01_intro {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        // Step - 1 (Create new Node)
        Node newNode = new Node(data);
        size++;
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
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLl(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInMid(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        int i = 0;
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked list is EMPTY");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("Linked List is EMPTY");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int searchLl(int key){
        Node temp = head;
        for(int i = 0; i < size; i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int iteSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void romove_from_end(int idx){
        if(idx == size){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        int i = 1;

        while(i < size - idx){
            temp = temp.next;
            i++;
        }

        Node delete = temp.next;
        temp.next = delete.next;
        size--;
        return;
    }

    // Slow Fast Approach 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  // 1 step at a time
            fast = fast.next.next;  // 2 step at a time
        }
        return slow;  // mid node
    }

    public boolean palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && head != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Cycle detected");
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;
        return;

    }


    private Node midMergeSort(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge (Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = midMergeSort(head);

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }



    public void zigZagLL(){
        Node mid = null;
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;


        Node curr = mid.next;
        Node prev = null;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftH = head;
        Node rightH = prev;
        Node nextR;
        Node nextL;

        while(leftH != null && rightH != null){
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            rightH = nextR;
            leftH = nextL;
        }

        return;
    }


    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        // Linked_list_01_intro ll = new Linked_list_01_intro();
        // ll.printLl();
        // ll.addFirst(1);
        // ll.printLl();
        // ll.addFirst(2);
        // ll.printLl();
        // ll.addLast(3);
        // ll.printLl();
        // ll.addLast(4);
        // ll.printLl();
        // ll.addInMid(2, 10);
        // ll.printLl();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLl();
        // System.out.println(ll.size);

        // ll.removelast();
        // ll.printLl();
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // System.out.println(ll.searchLl(3));
        // System.out.println(ll.recSearch(3));
        // ll.printLl();
        // ll.reverse();
        // ll.printLl();
        // ll.reverse();
        // ll.printLl();
        // ll.romove_from_end(4);
        // ll.printLl();

        // ll.romove_from_end(4);
        // ll.printLl();
        // ll.removelast();
        // ll.removelast();
        // ll.removelast();
        // ll.removelast();
        // ll.printLl();

        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(37);
        // ll.printLl();
        // System.out.println(ll.palindrome());

        // System.out.println(ll.isCycle());

        // Linked_list_01_intro ll = new Linked_list_01_intro();

        // ll.head = ll.new Node(1);
        // Node temp = ll.new Node(2);

        // ll.head.next = temp;

        // ll.printLl();

        // System.out.println(isCycle());

        // removeCycle();

        // ll.printLl();
        // System.out.println(isCycle());


        Linked_list_01_intro ll = new Linked_list_01_intro();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(6);

        ll.printLl();
        
        ll.zigZagLL();;
        ll.printLl();
    }
}