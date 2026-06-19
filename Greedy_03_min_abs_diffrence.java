import java.util.Arrays;

public class Greedy_03_min_abs_diffrence {

    public static int abs_diff_pairs(int arrA[], int arrB[]){
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int minSum = 0;
        for(int i = 0; i < arrA.length; i++){
            minSum += Math.abs(arrA[i] - arrB[i]);
        }
        return minSum;
    }

    public static void main(String[] args) {
        int arrA[] = {4, 1, 8, 7};
        int arrB[] = {2, 3, 6, 5};

        System.out.println("Min difference : " + abs_diff_pairs(arrA, arrB));
    }
}
