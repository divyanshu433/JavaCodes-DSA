public class bubble_sort {

    public static int[] bubble (int arr[]){
        int swap = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubble(arr);

        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
