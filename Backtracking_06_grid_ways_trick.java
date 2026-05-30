public class Backtracking_06_grid_ways_trick {
    public static int gridWaysTrick(int n, int m){
        return fact(m - 1 + n - 1) / (fact(n - 1) * fact(m - 1));
    }

    public static int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(gridWaysTrick(n, m));
    }
}
