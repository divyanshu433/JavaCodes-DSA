public class Backtracking_04_arrays {

    public static void arrays(int arr[], int i){
        if(i == arr.length){
            System.out.println();
            return;
        }

        arr[i] = i + 1;
        System.out.print(arr[i] + " ");
        arrays(arr, i + 1);
        arr[i] -= 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arrays(arr, 0);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
