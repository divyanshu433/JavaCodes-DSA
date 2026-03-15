public class Recursion_15_numbers_to_words {

    public static void numbers_to_words (int num, StringBuilder str){
        if (num == 0){
            return;
        }

        int lst = num % 10;

        String arr[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};

        numbers_to_words(num/10, str);
        
        str.append(arr[lst]);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        numbers_to_words(1947, sb);
        System.out.println(sb);
    }
}
