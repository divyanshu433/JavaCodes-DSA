public class insertion_sort {

    public static int[] insertion (int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int curr = arr[i];
            int pre = i - 1;

            while (pre >= 0 && arr[pre] > curr){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre + 1] = curr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        insertion(arr);

        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
