public class Recursion_29_bin_strings {

    public static void bin_strings (int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        bin_strings(n - 1, 0, str + "0");
        if(lastPlace == 0){ 
            bin_strings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        bin_strings(5, 0, "");
    }
}
