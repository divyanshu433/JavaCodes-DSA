public class Recursion_16_length_of_str {

    public static int length_of_str (String str){
        if (str.length() == 0){
            return 0;
        }
        return length_of_str(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(length_of_str("Divyanshu"));
    }
}
