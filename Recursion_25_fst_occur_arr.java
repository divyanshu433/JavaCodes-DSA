public class Recursion_25_fst_occur_arr {
    public static void first_occur(int arr[], int key, int i){
        if(i == arr.length){
            System.out.println("Not found in array");
            return;
        }
        if(arr[i] == key){
            System.out.println("Found at idx : " + i);
            return;
        } 
        first_occur(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1};
        first_occur(arr, 7, 0);
    }
}
