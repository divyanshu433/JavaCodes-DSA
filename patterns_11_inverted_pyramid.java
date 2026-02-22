import java.util.*;

public class patterns_11_inverted_pyramid{

    public static void inverted_pyramid (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i + j <= n){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        inverted_pyramid(side);

        sc.close();
    }
}