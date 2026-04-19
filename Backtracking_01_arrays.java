public class Backtracking_01_arrays {

    public static void change_arr(int arr[], int ele, int i){
        if(i == arr.length){
            print_Arr(arr);
            return;
        }
        arr[i] = ele;
        change_arr(arr, ele + 1, i + 1);
        arr[i] -= 2;
    }

    public static void print_Arr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        change_arr(arr, 1, 0);
        print_Arr(arr);
    }
}
