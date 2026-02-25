public class counting_sort {

    public static int[] counting (int arr[]){
        int largerst = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largerst = Math.max(largerst, arr[i]);
        }

        int count[] = new int [largerst + 1];

        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        counting(arr);

        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
