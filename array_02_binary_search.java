public class array_02_binary_search {

    public static int binary_search (int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        int key = 20;

        int status = binary_search(numbers, key);

        if(status == -1){
            System.out.print("NOT FOUND");
        }
        else{
            System.out.println("Found at location : " + status);
        }
    }
}
