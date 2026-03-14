public class Recursion_13_binary_strings {

    public static void binary_strings (int n, int lastPlace, String str){
        if (n == 0){
            System.out.println(str);
            return;
        }
        binary_strings(n - 1, 0, str+"0");
        if (lastPlace == 0){
            binary_strings(n - 1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binary_strings(4, 0, "");
    }
}
