import java.util.ArrayList;

public class heaps_02 {

    static class Heap{
        ArrayList <Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);

            int ch = arr.size() - 1; // child index
            int par = (ch - 1) / 2; // parent index

            while(arr.get(ch) < arr.get(par)){
                int temp = arr.get(ch);
                arr.set(ch, arr.get(par));
                arr.set(par, temp);

                ch = par;
                par = (ch - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapyify(int idx){
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != idx){
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapyify(minIdx);
            }
            
            
        }

        public int remove(){
            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // deleting last index
            arr.remove(arr.size() - 1);

            // heapyify
            heapyify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
