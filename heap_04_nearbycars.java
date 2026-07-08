import java.util.*;

public class heap_04_nearbycars {

    static class Cars implements Comparable<Cars>{
        String name;
        int distance;

        public Cars(String name, int distance){
            this.name = name;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Cars c2){
            return this.distance - c2.distance;
        }
    }

    public static void nearbyCars(int pts[][], int k){
        PriorityQueue <Cars> pq = new PriorityQueue<>();
        for(int i = 0; i < pts.length; i++){
            int distance = (pts[0][0] * pts[0][0]) + (pts[0][1] + pts[0][1]);
            Cars c1 = new Cars("C" + (i + 1), distance);
            pq.add(c1);
        }
        for(int i = 0; i < k; i++){
            System.out.print(pq.remove().name + " ");
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        nearbyCars(pts, k);
    }
}
