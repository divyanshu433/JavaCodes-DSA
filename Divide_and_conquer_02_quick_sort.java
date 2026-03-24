public class Divide_and_conquer_02_quick_sort {

    public static void print_Arr (int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quick_sort (int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pviot_idx = partition(arr, si, ei);

        quick_sort(arr, si, pviot_idx - 1);
        quick_sort(arr, pviot_idx + 1, ei);

        
    }

    public static int partition (int arr[], int si, int ei){
        int pviot = arr[ei];
        int i = si - 1;
        for(int j = si; j < ei; j++){
            if (arr[j] <= pviot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, -2};

        quick_sort(arr, 0, arr.length - 1);

        print_Arr(arr);
    }
}
