import java.util.*;

public class function1 {

    public static int calcProduct(int a, int b){
    return a*b;
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int product = calcProduct(a,b);
        System.out.print("Proudct : " + product);
        sc.close();
    }
}
