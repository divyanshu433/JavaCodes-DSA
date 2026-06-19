import java.util.Arrays;
import java.util.Comparator;

public class Greedy_02_Fractional_knapsack {

    public static double maxValue_knapsack (int value[], int weight[], int w){
        double arr2d[][] = new double [value.length][3];
        int capacity = w;
        double maxValue = 0;
        for(int i = 0; i < value.length; i++){
            arr2d[i][0] = value[i];
            arr2d[i][1] = weight[i];
            arr2d[i][2] = value[i]  / (double) weight[i];
        }

        Arrays.sort(arr2d, Comparator.comparingDouble(o -> o[2]));

        for(int i = value.length - 1; i >= 0; i--){
            if(capacity >= arr2d[i][1]){
                capacity -= arr2d[i][1];
                maxValue += arr2d[i][0];
            }
            else{
                maxValue += (arr2d[i][2] * capacity);
                break;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        System.out.println(maxValue_knapsack(value, weight, w));
    }
}
