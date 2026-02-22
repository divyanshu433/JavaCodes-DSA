import java.util.*;

public class function3_ncr {

    public static int CalcBinomialCoeff (int n, int r){
        int binomialCoeff = 1;

        for (int i = 1; i <= n; i++){
            binomialCoeff *= i;
        }
        for (int j = 1; j <= r; j++){
            binomialCoeff /= j;
        }
        for (int k = 1; k <= (n-r); k++){
            binomialCoeff /= k;
        }
        return binomialCoeff;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();
        
        System.out.print("Binomial Coefficient : " + CalcBinomialCoeff(n, r));

        sc.close();
    }
}
