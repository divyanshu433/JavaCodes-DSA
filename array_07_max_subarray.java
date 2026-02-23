public class array_07_max_subarray{

    public static void max_sum_sub_array (int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int sum = 0;
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("  SUM = " +sum);
                System.out.println();
                if (max_sum < sum){
                    max_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.print("MAX SUM = " + max_sum);

    }
    
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        max_sum_sub_array(arr);
    }
}