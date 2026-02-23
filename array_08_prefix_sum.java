public class array_08_prefix_sum {

    public static void max_sum_sub_array (int arr[]){
        int prefix_arr[] = new int [arr.length];
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        prefix_arr[0] = arr[0];

        for (int i = 1; i < arr.length; i++){
            prefix_arr[i] = arr[i] + prefix_arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){

                if (i == 0){
                    sum = prefix_arr[j];
                }
                else{
                    sum = prefix_arr[j] - prefix_arr[i - 1];
                }

                System.out.println("SUM : " + sum);
                if (sum > max_sum){
                    max_sum = sum;
                }
            }
        }
        System.out.print("MAX SUM : " + max_sum);
        
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};

        max_sum_sub_array(arr);
    }
}
