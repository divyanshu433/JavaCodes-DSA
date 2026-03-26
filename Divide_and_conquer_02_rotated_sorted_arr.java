public class Divide_and_conquer_02_rotated_sorted_arr {

    public static int search (int arr[], int key, int si, int ei){
        if(si >= ei){
            return -1;
        }
        int mid = (si + ei)/2;

        if (arr[mid] == key){
            return mid;
        }

        else if (arr[si] <= arr[mid]){
            if ((arr[si] <= key) && (arr[mid] >= key)){
                return search(arr, key, si, mid - 1);
            }
            else{
                return search(arr, key, mid + 1, ei);
            }
        }

        else{
            if ((arr[ei] >= key) && (arr[mid] <= key)){
                return search(arr, key, mid + 1, ei);
            }
            else{
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5 ,6 ,7, 1, 2, 3, 4, 5};
        int key = 3;
        System.out.println(search(arr, key, 0, arr.length - 1));
    }
}
