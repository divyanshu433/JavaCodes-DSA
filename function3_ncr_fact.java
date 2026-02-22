import java.util.*;

public class function3_ncr_fact {

    public static int CalcFactorial(int n){
        int factorial = 1;
        
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int CalcBinomialCoeff (int n, int r){
        int n_fact = CalcFactorial(n);
        int r_fact = CalcFactorial(r);
        int nmr_fact = CalcFactorial(n-r);

        return (n_fact / (r_fact * nmr_fact));
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int Binomial = CalcBinomialCoeff(n,r);
        System.out.print("Factorial is : " + Binomial);

        sc.close();

    }
}
