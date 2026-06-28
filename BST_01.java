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

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
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





    }
}
