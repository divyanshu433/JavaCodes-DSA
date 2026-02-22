import java.util.*;

public class function2 {

    public static int calcFactorial(int n){
        int factorial = 1;
        
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to get factorial : ");
        int num = sc.nextInt();

        int fact = calcFactorial(num);
        System.out.print("Factorial is : " + fact);

        sc.close();

    }
}
