public class selection_sort_prac01 {

    public static void selection (int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i; j < n; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 5, 3};

        selection(arr);
        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
