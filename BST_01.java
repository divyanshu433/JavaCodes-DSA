import java.util.ArrayList;

import org.w3c.dom.Node;

public class BST_01 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node is = findInorderSucc(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node findInorderSucc(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(arr);
        }
        rootToLeafPath(root.left, arr);
        rootToLeafPath(root.right, arr);
        arr.remove(arr.size() - 1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(ArrayList<Integer> list, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = st + (end - st) / 2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);
        return root;
    }

    public static void inOrderInArrayList(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inOrderInArrayList(root.left, list);
        list.add(root.data);
        inOrderInArrayList(root.right, list);
    }

    public static Node bstToBalancedBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderInArrayList(root, list);
        Node node = createBST(list, 0, list.size() - 1);
        return node;
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.size = size;
            this.max = max;
            this.isBST = isBST;
            this.min = min;

        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = largestBST(root.left);
        Info right = largestBST(root.right);

        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if(root.data <= left.max || root.data >= right.min){
            return new Info(false, size, min, max);
        }
        if(left.isBST && right.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static Node mergeBSTs(Node root1, Node root2){
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();

        inOrderInArrayList(root1, list1);
        inOrderInArrayList(root2, list2);

        ArrayList <Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                list.add(list1.get(i));
                i++;
            }
            else{
                list.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()){
            list.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            list.add(list2.get(j));
            j++;
        }

        Node finalRoot = createBST(list, 0, list.size() - 1);
        return finalRoot;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root1 = null;

        for (int i = 0; i < values.length; i++) {
            root1 = insert(root1, values[i]);
        }

        inorder(root1);
        System.out.println();

        int nodes[] = { 3, 5, 1, 2, 6, 7, 4, 9, 8, 10 };

        Node root2 = null;

        for (int i = 0; i < nodes.length; i++) {
            root2 = insert(root2, nodes[i]);
        }

        inorder(root2);
        System.out.println();

        if (search(root1, 1)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        System.out.println();

        int values3[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root3 = null;

        for (int i = 0; i < values3.length; i++) {
            root3 = insert(root3, values3[i]);
        }

        inorder(root3);
        System.out.println();

        delete(root3, 5);
        System.out.println();

        inorder(root3);
        System.out.println();

        printInRange(root3, 5, 12);
        System.out.println();
        System.out.println();

        ArrayList<Integer> arr = new ArrayList<>();
        rootToLeafPath(root3, arr);
        System.out.println();
        System.out.println();

        Node root5 = new Node(8);
        root5.left = new Node(5);
        root5.right = new Node(10);
        root5.left.left = new Node(3);
        root5.left.right = new Node(6);
        root5.right.right = new Node(11);

        preorder(root5);
        System.out.println();
        mirror(root5);
        preorder(root5);
        System.out.println();

        // ArrayList <Integer> list1 = { 3, 5, 6, 8, 10, 11, 12 };
        // Node root6 = createBST(list1, 0, list1.size() - 1);
        // preorder(root6);

        // System.out.println();
        // System.out.println();

        Node root7 = new Node(8);
        root7.left = new Node(6);
        root7.left.left = new Node(5);
        root7.left.left.left = new Node(3);

        root7.right = new Node(10);
        root7.right.right = new Node(11);
        root7.right.right.right = new Node(12);

        System.out.println();
        System.out.println();
        System.out.println();
        preorder(root7);
        System.out.println();
        Node balanced = bstToBalancedBST(root7);
        preorder(balanced);
        System.out.println();



        Node root10 = new Node(50);

        root10.left = new Node(30);
        root10.left.left = new Node(5);
        root10.left.right = new Node(20);

        root10.right = new Node(60);
        root10.right.left = new Node(45);
        root10.right.right = new Node(70);
        root10.right.right.left = new Node(65);
        root10.right.right.right = new Node(80);

        Info info = largestBST(root10);
        System.out.println("Largest BST size : " + maxBST);


        System.out.println();
        System.out.println();

        Node bst1 = new Node(2);
        bst1.left = new Node(1);
        bst1.right = new Node(4);
        preorder(bst1);
        System.out.println();

        Node bst2 = new Node(9);
        bst2.left = new Node(3);
        bst2.right = new Node(12);
        preorder(bst2);
        System.out.println();

        Node bst3 = mergeBSTs(bst1, bst2);
        preorder(bst3);
        System.out.println();

    }
}
