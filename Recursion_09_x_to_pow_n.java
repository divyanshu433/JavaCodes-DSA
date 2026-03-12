public class Recursion_09_x_to_pow_n {

    public static int x_to_pow_n (int x, int n){
        if (n == 0){
            return 1;
        }
        return x * x_to_pow_n(x, n - 1);
    }

    public static void main(String[] args) {
        System.err.println(x_to_pow_n(2, 10));
    }
}
