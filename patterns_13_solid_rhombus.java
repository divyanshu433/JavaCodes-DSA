import java.util.*;

public class patterns_13_solid_rhombus {

    public static void solid_rhombus (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        solid_rhombus(side);

        sc.close();
    }
}
