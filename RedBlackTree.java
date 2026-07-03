import java.io.*;

import org.w3c.dom.Node;

public class RedBlackTree {

    public Node root; // root node

    public RedBlackTree() {
        super();
        root = null;
    }

    class Node {
        int data;
        Node left;
        Node right;
        char colour;
        Node parent;

        Node(int data) {
            super();
            this.data = data;
            this.left = null;
            this.right = null;
            this.colour = 'R';
            this.parent = null;
        }
    }

    // Flags used during rotations
    boolean ll = false;
    boolean rr = false;
    boolean lr = false;
    boolean rl = false;

    // Left Rotation
    Node rotateLeft(Node node) {
        Node x = node.right;
        Node y = x.left;

        x.left = node;
        node.right = y;
        node.parent = x;

        if (y != null)
            y.parent = node;

        return x;
    }

    // Right Rotation
    Node rotateRight(Node node) {
        Node x = node.left;
        Node y = x.right;

        x.right = node;
        node.left = y;
        node.parent = x;

        if (y != null)
            y.parent = node;

        return x;
    }

    // Helper function for insertion
    Node insertHelp(Node root, int data) {

        boolean f = false;

        // BST insertion
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {

            root.left = insertHelp(root.left, data);
            root.left.parent = root;

            if (root != this.root) {
                if (root.colour == 'R' && root.left.colour == 'R')
                    f = true;
            }

        } else {

            root.right = insertHelp(root.right, data);
            root.right.parent = root;

            if (root != this.root) {
                if (root.colour == 'R' && root.right.colour == 'R')
                    f = true;
            }
        }

        // Perform rotations
        if (this.ll) {

            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.ll = false;

        } else if (this.rr) {

            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.rr = false;

        } else if (this.rl) {

            root.right = rotateRight(root.right);
            root.right.parent = root;

            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';

            this.rl = false;

        } else if (this.lr) {

            root.left = rotateLeft(root.left);
            root.left.parent = root;

            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';

            this.lr = false;
        }

        // Fix Red-Red conflict
        if (f) {

            // Parent is right child of grandparent
            if (root.parent.right == root) {

                // Uncle is black
                if (root.parent.left == null || root.parent.left.colour == 'B') {

                    if (root.left != null && root.left.colour == 'R')
                        this.rl = true;
                    else if (root.right != null && root.right.colour == 'R')
                        this.ll = true;
                }

                // Uncle is red
                else {

                    root.parent.left.colour = 'B';
                    root.colour = 'B';

                    if (root.parent != this.root)
                        root.parent.colour = 'R';
                }

            }

            // Parent is left child of grandparent
            else {

                // Uncle is black
                if (root.parent.right == null || root.parent.right.colour == 'B') {

                    if (root.left != null && root.left.colour == 'R')
                        this.rr = true;
                    else if (root.right != null && root.right.colour == 'R')
                        this.lr = true;
                }

                // Uncle is red
                else {

                    root.parent.right.colour = 'B';
                    root.colour = 'B';

                    if (root.parent != this.root)
                        root.parent.colour = 'R';
                }
            }

            f = false;
        }

        return root;
    }

    // Insert into Red-Black Tree
    public void insert(int data) {

        if (this.root == null) {
            this.root = new Node(data);
            this.root.colour = 'B';
        } else {
            this.root = insertHelp(this.root, data);
        }
    }

    // Inorder Traversal Helper
    void inorderTraversalHelper(Node node) {

        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.printf("%d ", node.data);
            inorderTraversalHelper(node.right);
        }
    }

    // Inorder Traversal
    public void inorderTraversal() {
        inorderTraversalHelper(this.root);
    }

    // Tree Printing Helper
    void printTreeHelper(Node root, int space) {

        if (root != null) {

            space += 10;

            printTreeHelper(root.right, space);

            System.out.println();

            for (int i = 10; i < space; i++)
                System.out.print(" ");

            System.out.println(root.data + "(" + root.colour + ")");

            printTreeHelper(root.left, space);
        }
    }

    // Print Tree
    public void printTree() {
        printTreeHelper(this.root, 0);
    }

    public static void main(String[] args) {

        RedBlackTree t = new RedBlackTree();

        int[] arr = {1, 4, 6, 3, 5, 7, 8, 2, 9};

        for (int i = 0; i < arr.length; i++) {
            t.insert(arr[i]);
            System.out.println();
            t.inorderTraversal();
        }

        System.out.println();
        t.printTree();
    }
}