import java.util.Arrays;
import java.util.Comparator;

public class greedy_04_max_len_chain_pairs {

    public static int max_len_chain_pairs(int pairs[][]){
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int count = 0;

        int lastSelected = pairs[0][1];
        count++;
        for(int i = 0; i < pairs.length; i++){
            if(pairs[i][0] > lastSelected){
                count++;
                lastSelected = pairs[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        System.out.println("Max length : " + max_len_chain_pairs(pairs));
    }
}
