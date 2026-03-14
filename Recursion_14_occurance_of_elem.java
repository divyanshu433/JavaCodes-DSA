public class Recursion_14_occurance_of_elem {

    public static int occurance_of_elem (int arr[], int idx, int key){
        int n = arr.length;
        if(idx == n){
            return 0;
        }

        if(arr[idx] == key){
            System.out.print(idx + " ");
        }

        return occurance_of_elem(arr, idx + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 3, 2, 5 ,2 ,7, 8, 2, 2};
        occurance_of_elem(arr, 0, 2);
    }
}
