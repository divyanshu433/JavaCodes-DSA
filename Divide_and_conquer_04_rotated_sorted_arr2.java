public class Divide_and_conquer_04_rotated_sorted_arr2 {

    public static int rotated_sorted_arr (int arr[], int key){
        int si = 0;
        int ei = arr.length - 1;


        while (si <= ei){
            int mid = (si + ei)/2;

            if (arr[mid] == key){
                return mid;
            }

            else if (arr[si] <= arr[mid]){
                if ((arr[si] <= key) && (arr[mid] > key)){
                    ei = mid - 1;
                }
                else{
                    si = mid + 1;
                }
            }

            else{
                if ((arr[mid] < key) && (arr[ei] >= key)){
                    si = mid + 1;
                }
                else{
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5 ,6 ,7, 1, 2, 3, 4};
        System.out.println("Found at idx : " + rotated_sorted_arr(arr, 3));
    }
}
