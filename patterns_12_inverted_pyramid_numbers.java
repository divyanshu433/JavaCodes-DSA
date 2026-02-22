import java.util.*;

public class patterns_12_inverted_pyramid_numbers {

    public static void inverted_pyramid_numbers (int n){
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= n; j++){
                if (i+j <= n+1){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        inverted_pyramid_numbers(num);

        sc.close();
    }
}
