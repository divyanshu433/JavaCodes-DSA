public class Recursion_17_start_end_with_same_char {

    public static void start_end_with_same_char (String str, int idx){
        char currCar = str.charAt(idx);
        System.out.println(currCar);

        if(currCar != str.charAt(idx + 1)){
            start_end_with_same_char(str, idx + 1);
        }
    }

    public static void main(String[] args) {
        start_end_with_same_char("abcabcf", 0);
    }
}
