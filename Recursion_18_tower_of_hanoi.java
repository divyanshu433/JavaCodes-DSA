public class Recursion_18_tower_of_hanoi {

    public static void helper(int n, int from, int to, int aux, int count){
        if (n == 0){
            return;
        }
        helper(n - 1, from, aux, to, count);
        count++;
        helper(n - 1, aux, to, from, count);
    }

    public static int tower_of_hanoi (int n, int from, int to, int aux){
        int count = 0;
        helper(n, from, to, aux, count);
        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        int result = tower_of_hanoi(n, 1, 3, 2);
        System.out.println("Total moves: " + result);
    }
}
