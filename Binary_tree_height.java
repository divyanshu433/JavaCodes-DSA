import java.util.*;

import org.w3c.dom.Node;

public class Binary_tree_height {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int calcHeight(Node root){
        if(root == null){
            return 0;
        }

        int lh = calcHeight(root.left);
        int lr = calcHeight(root.right);
        int height = Math.max(lh, lr) + 1;
        return height;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        
        return lc + rc + 1;
    }

    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }

        int lSum = sumNodes(root.left);
        int rSum = sumNodes(root.right);

        return lSum + rSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(calcHeight(root));
        System.out.println(countNodes(root));
        System.out.println(sumNodes(root));
    }
}
