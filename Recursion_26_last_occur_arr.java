public class Recursion_26_last_occur_arr {
    public static void last_occur(int arr[], int key, int i){
        if(i == -1){
            System.out.println("Not found in array");
            return;
        }
        if(arr[i] == key){
            System.out.println("Found at idx : " + i);
            return;
        } 
        last_occur(arr, key, i - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 6 ,5 ,5};
        last_occur(arr, 5, arr.length - 1);
    }
}
