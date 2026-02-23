public class array_08_prefix_sum {

    public static void max_sum_sub_array (int arr[]){
        int prefix_arr[] = new int [arr.length];
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            prefix_arr[i] = prefix_arr[i - 1] + arr[i];
            for (int j = i; j < prefix_arr.length; j++){
                sum = prefix_arr[i] - prefix_arr[i-1];
            }
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        max_sum_sub_array(arr);
    }
}
