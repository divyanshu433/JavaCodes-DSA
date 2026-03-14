public class Recursion_15_numbers_to_words {

    public static void numbers_to_words (int num, String str){
        if (num == 0){
            System.out.println(str);
            return;
        }
        int lst = num % 10;
        num = num / 10;
        String arr[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};

        numbers_to_words(num, arr[lst] + str);
    }

    public static void main(String[] args) {
        numbers_to_words(1947, "");
    }
}
