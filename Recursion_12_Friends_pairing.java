public class Recursion_12_Friends_pairing {

    public static int friends_pairing (int n){
        if ((n == 1) || (n == 2)){
            return n;
        }
        return friends_pairing(n - 1) + (n - 1) * friends_pairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friends_pairing(4));
    }
}
