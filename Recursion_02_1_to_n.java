public class Recursion_02_1_to_n {
    public static void n_in_increasing(int n){
        if(n == 0){
            return;
        }
        n_in_increasing(n - 1);
        System.out.print(n + " ");
    }   

    public static void main(String[] args) {
        n_in_increasing(10);
    }
}
