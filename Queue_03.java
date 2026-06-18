import java.util.LinkedList;
import java.util.Queue;

public class Queue_03 {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
