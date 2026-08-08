public class trie_02_prefix_prob {

    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for(int i = 0; i < childern.length; i++) {
                childern[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.childern[idx] == null) {
                curr.childern[idx] = new Node();
            }
            else {
                curr.childern[idx].freq++;
            }

            curr = curr.childern[idx];
        }

        curr.eow = true;
    }

    public static void findPrefix(Node word, String ans) {

        if(word == null) {
            return;
        }

        if(word.freq == 1) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < word.childern.length; i++) {
            if(word.childern[i] != null) {
                findPrefix(
                    word.childern[i],
                    ans + (char)(i + 'a')
                );
            }
        }
    }

    public static void main(String[] args) {

        String arr[] = {"zebra", "dog", "duck", "dove"};

        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;

        findPrefix(root, "");
    }
}