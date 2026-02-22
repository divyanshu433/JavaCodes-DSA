public class array_01 {

    public static int largest (int num[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int num [] = {1, 2, 6, 3, 5};

        System.out.print("max = " +largest(num));
    }
}
