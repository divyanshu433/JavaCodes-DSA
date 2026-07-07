import java.util.*;

public class heap_03_sort {

    private static void heapify(int idx, int size, int arr[]){
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int maxIdx = idx;

        if(left < size && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != idx){
            // swap
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(maxIdx, size, arr);
        }
    }

    public static void heapSort(int arr[]){
        // step - 1 (Build max heap)
        int n = arr.length;
        for(int i = n / 2; i >= 0; i--){
            heapify(i, n, arr);
        }

        // step - 2 (push largest elem to end)
        for(int i = n - 1; i > 0; i--){
            // swap first elem to last elem
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i, arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};

        heapSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }
}
