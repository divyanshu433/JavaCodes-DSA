public class Trapping_Rainwater {

    public static void rainwater_trapped (int arr[]){
        int left_max_arr[] = new int[arr.length];
        int right_max_arr[] = new int[arr.length];

        left_max_arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            left_max_arr[i] = Math.max(arr[i], left_max_arr[i-1]);
        }

        right_max_arr[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--){
            right_max_arr[i] = Math.max(arr[i], right_max_arr[i+1]);
        }

        int water_level = 0;
        int rainwater_trapped = 0;
        for (int i = 0; i < arr.length; i++){
            water_level = Math.min(left_max_arr[i], right_max_arr[i]);
            rainwater_trapped += water_level - arr[i];
        }
        System.out.println(rainwater_trapped);
    }

    public static void main (String args[]){
        int arr[] = {4, 2, 0, 6, 3, 2, 5};

        rainwater_trapped(arr);
    }
}
