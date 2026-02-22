public class array_06_sub_array {

    public static void sub_array (int num[]){
        int total = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            for (int j = i; j < num.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    System.out.print(num[k] + " ");
                    sum += num[k];
                    if (sum > max_sum){
                        max_sum = sum;
                    }
                    if(sum < min_sum){
                        min_sum = sum;
                    }
                }
                total ++;
                System.out.println();
                System.out.println("SUM : " + sum);
            }
            System.out.println();
        }
        System.out.println("Total sub arrays : " + total);
        System.out.println("MAX SUM  : " + max_sum);
        System.out.println("MIN SUM : " + min_sum);
        
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};

        sub_array(num);
    }
}
