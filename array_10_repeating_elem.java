public class array_10_repeating_elem {
    public static boolean is_repeating (int arr[]){
        int n = arr.length;
        boolean repeating = false;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return repeating;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};

        System.out.println(is_repeating(arr));
    }
}
