import java.security.PublicKey;
import java.util.*;

import org.w3c.dom.Node;

public class Binary_tree_02 {
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


    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameter2(root.left);
        int lh = calcHeight(root.left);
        int rd = diameter2(root.right);
        int rh = calcHeight(root.right);
        return Math.max(lh + rh + 1, Math.max(ld, rd));
    }

    static class Info {
        int diam;
        int ht;
        
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
        
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightinfo = diameter(root.right);
        int diam = Math.max(leftInfo.ht + rightinfo.ht + 1, Math.max(leftInfo.diam, rightinfo.diam));
        int ht = Math.max(leftInfo.ht, rightinfo.ht) + 1;
        return new Info(diam, ht);
    }


    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class Info2{
        Node node;
        int hd;

        public Info2(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue <Info2> q = new LinkedList<>();
        HashMap <Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;

        q.add(new Info2(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info2 curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if(curr.node.right != null){
                    q.add(new Info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        // System.out.println(calcHeight(root));
        // System.out.println(countNodes(root));
        // System.out.println(sumNodes(root));
        // System.out.println(diameter2(root));
        // System.out.println(diameter(root).diam);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));

        topView(root);

    }
}
