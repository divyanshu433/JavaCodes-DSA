public class Recursion_03_factorial {

    public static int calcFactorial (int n){
        if (n == 0){
            return 1;
        }
        return n * calcFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
}
