import java.util.*;

import org.w3c.dom.Node;

public class hashmap_implementation {

    static class HashMap<K, V>{ //  K & V are generic (can be use for any datatype)
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N


        // this function initilize buckets with empty LinkedList
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;

        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key.equals(key)){      // Fixed
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            n = 0; // Fixed

            // nodes -> add in bucket
            for(int i = 0; i < oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i]; // Fixed
                while(!ll.isEmpty()){             // Fixed
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put (K key, V value){ // O(lambda) -> O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi); // Fixed

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if(lambda > 2.0){
                reHash();
            }
        }

        public boolean containsKey(K key){ // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                return true;
            }
            else{
                return false;
            }
        }

        public V remove(K key){ //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi); // Fixed

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public V get(K key){  // O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi); // Fixed

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){ // Fixed
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

    }


    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 30);
        hm.put("Norway", 15);

        ArrayList<String> keys = hm.keySet();

        System.out.println(keys);

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}