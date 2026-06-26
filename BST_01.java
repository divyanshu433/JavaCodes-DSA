import org.w3c.dom.Node;

public class BST_01 {
    static class Node{
        int data;
        Node left; 
        Node right;

        Node (int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static 
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root1 = null;

        for(int i = 0 ; i < values.length; i++){
            root1 = insert(root1, values[i]);
        }

        inorder(root1);
        System.out.println();


        int nodes[] = {3, 5, 1, 2, 6, 7, 4, 9, 8, 10};

        Node root2 = null;

        for(int i = 0 ; i < nodes.length; i++){
            root2 = insert(root2, nodes[i]);
        }

        inorder(root2);
        System.out.println();

        if(search(root1, 1)){
            System.out.println("FOUND");
        }
        else{
            System.out.println("NOT FOUND");
        }
    }
}
