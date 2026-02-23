public class array_09_kadane_algo {
    public static void kadane_algo (int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int max_num = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            curr_sum += arr[i];

            if (arr[i] > max_num){
                max_num = arr[i];
            }

            if (curr_sum < 0){
                curr_sum = 0;
            }

            if (curr_sum > max_sum){
                max_sum = curr_sum;
            }
        }
        if (max_num < 0){
            System.out.println("MAX SUM : " + max_num);
        }
        else{
            System.out.println("MAX SUM : " + max_sum);
        }
    }

    public static void main (String args[]){
        int arr[] = {1, -2, 6, -1, 3};

        kadane_algo(arr);
    }
}
