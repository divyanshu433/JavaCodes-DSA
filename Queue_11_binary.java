import java.util.*;
public class Queue_11_binary {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < N; i++) {
            String s = q.poll();
            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}

