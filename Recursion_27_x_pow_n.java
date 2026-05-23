public class Recursion_27_x_pow_n {
    public static int x_pow_n(int x, int n){
        if(n == 0){
            return 1;
        }
        int half_pow = x_pow_n(x, n / 2);
        int half_pow_sq = half_pow * half_pow;

        if(n % 2 != 0){
            half_pow_sq *= x;
        }
        return half_pow_sq;
    }
    public static void main(String[] args) {
        System.out.println(x_pow_n(2, 5));
    }
}
