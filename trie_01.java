import org.w3c.dom.Node;

public class trie_01 {

    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();


    public static void insert(String s){
        Node curr = root;
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }

    public static boolean wordBreak(String str){
        for(int i = 1; i <= str.length(); i++){
            
        }
    }

    public static void main(String[] args) {
        // String words[] = {"the", "a", "there", "their", "any", "thee"};
        // for(int i = 0 ; i < words.length; i++){
        //     insert(words[i]);
        // }

        // System.out.println(search("th"));
        // System.out.println(search("thee"));

        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
    }
}
