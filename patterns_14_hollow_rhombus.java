import java.util.*;

public class patterns_14_hollow_rhombus {

    public static void hollow_rhombus (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++){
                if ((i == 1) || (i == n) || (j == 1) || (j == n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        hollow_rhombus(side);

        sc.close();
    }
}
