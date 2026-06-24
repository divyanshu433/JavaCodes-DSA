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

    public static void kthLevel(Node node, int k, int curr){
        if(node == null){
            return;
        }
        if(k == curr){
            System.out.print(node.data + " ");
            return;
        }
        kthLevel(node.left, k, curr + 1);
        kthLevel(node.right, k, curr + 1);
    }

    public static boolean getPath(Node node,ArrayList <Node> arr, int val){
        if(node == null){
            return false;
        }
        arr.add(node);
        if(node.data == val){
            return true;
        }

        boolean left = getPath(node.left, arr, val);
        boolean right = getPath(node.right, arr, val);

        if(left || right){
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }

    

    public static Node lca(Node root, int n1, int n2){
        ArrayList <Node> arr1 = new ArrayList<>();
        ArrayList <Node> arr2 = new ArrayList<>();

        getPath(root, arr1, n1);
        getPath(root, arr2, n2);
        int i = 0;
        while(i < arr1.size() && i < arr2.size()){
            if(arr1.get(i) != arr2.get(i)){
                break;
            }
            i++;
        }
        return arr1.get(i - 1);

    }

    public static Node lca2(Node node, int n1, int n2){
        if(node == null){
            return null;
        }
        if(node.data == n1 || node.data == n2){
            return node;
        }

        Node left = lca2(node.left, n1, n2);
        Node right = lca2(node.right, n1, n2);

        if(right == null){
            return left;
        }

        if(left == null){
            return right;
        }

        return node;
    }


    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if(left == -1 && right == -1){
            return -1;
        }
        else if(left == -1){
            return right + 1;
        }
        else{
            return left + 1;
        }

    }

    public static int min_distance(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int distance1 = lcaDist(lca, n1);
        int distance2 = lcaDist(lca, n2);

        return distance1 + distance2;
    }

    public static int kthAncestor(Node root, int val, int n){
        if(root == null){
            return -1;
        }
        if(root.data == val){
            return 0;
        }

        int left = kthAncestor(root.left, val, n);
        int right = kthAncestor(root.right, val, n);

        if(left == -1 && right == -1){
            return -1;
        }

        int max = Math.max(left, right);

        if(max + 1 == n){
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }

        int left = sumTree(root.left);
        int right = sumTree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + left + newRight + right;
        return data;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
            / \   / \
           4   5 6   7

        */
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

        kthLevel(root, 3, 1);
        System.out.println();

        System.out.println(lca(root, 4, 5).data);
        System.out.println(lca2(root, 4, 5).data);

        System.out.println();
        System.out.println(min_distance(root, 4, 5));

        System.out.println(kthAncestor(root, 4, 1));

        preOrder(root);
        System.out.println(sumTree(root));
        preOrder(root);
    }
}
