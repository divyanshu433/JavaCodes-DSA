public class Recursion_09_x_to_pow_n_opt {

    public static int pow_opt (int x ,int n){
        if (n == 0){
            return 1;
        }

        int half_pow = pow_opt(x, n/2);

        if(n % 2 != 0){
            return half_pow * half_pow * x;
        }
        return half_pow * half_pow;
    }
    
    public static void main(String[] args) {
        System.out.println(pow_opt(2, 10));
    }

}
