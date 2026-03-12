public class Recursion_07_first_occur_in_arr {

    public static int first_occur (int arr[], int elem, int i){
        if (arr[i] == arr.length){
            return -1;
        }
        if(arr[i] == elem){
            return i;
        }

        return first_occur(arr, elem, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9 , 5};

        System.out.println("FOUND AT INDEX : " + first_occur(arr,10, 0));
    } 
}
