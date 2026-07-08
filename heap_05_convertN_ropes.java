import java.util.PriorityQueue;

public class heap_05_convertN_ropes {
    public static void main(String[] args) {
        int ropes[] = {2, 3, 3, 4, 6};
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        while(pq.size() > 1){
            int currCost = pq.remove() + pq.remove();
            cost += currCost;
            pq.add(currCost);
        }
        System.out.print(cost);
    }
}
