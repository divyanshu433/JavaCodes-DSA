public class Recursion_04_sumOfnNumbers {

    public static int sumOfnNumbers (int n){
        if (n == 1){
            return 1; 
        }
        return n + sumOfnNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfnNumbers(5));
    }
}
