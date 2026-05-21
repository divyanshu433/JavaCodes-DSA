public class aaa_prac_01 {
    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        double num_half = myPow(x, n/2);

        if(n % 2 != 0){
            return num_half * num_half * x;
        }
        return num_half * num_half;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
}
