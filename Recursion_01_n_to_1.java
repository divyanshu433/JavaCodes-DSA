public class Recursion_01_n_to_1 {

    public static void nTo1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        nTo1(n - 1);
    }   

    public static void main(String[] args) {
        nTo1(10);
    }
}
