import java.util.Arrays;
import java.util.Collections;

public class Greedy_07_chocola_problem {

    public static int chocola_problem(Integer costV[], Integer costH[]){
        int m = costV.length;
        int n = costH.length;

        Arrays.sort(costV, Collections.reverseOrder());
        Arrays.sort(costH, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int totalCost = 0;

        while(v < m && h < n){
            if(costV[v] >= costH[h]){
                totalCost += hp * costV[v];
                vp++;
                v++;
            }
            else{
                totalCost += vp * costH[h];
                hp++;
                h++;
            }
        }

        while(v < m){
            totalCost += hp * costV[v];
            vp++;
            v++;
        }
        while(h < n){
            totalCost += vp * costH[h];
            hp++;
            h++;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Integer costV[] = {2, 1, 3, 1, 4};
        Integer costH[] = {4, 1, 2};

        System.out.println("Total Cost : " + chocola_problem(costV, costH));
    }
}
