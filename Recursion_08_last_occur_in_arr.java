public class Recursion_08_last_occur_in_arr {
    
    public static int last_occur (int arr[], int elem, int i){
        if (arr[i] == 0){
            return -1;
        }
        if(arr[i] == elem){
            return i;
        }
        return last_occur(arr, elem, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9 , 5, 2, 4, 5};

        System.out.println("FOUND AT INDEX : " + last_occur(arr,2, arr.length - 1));
    } 
}
