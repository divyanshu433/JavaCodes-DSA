import java.util.*;

public class patterns_12_floyds_traingle {

    public static void floyds_traingle (int n){
        int counter = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i - j >= 0){
                    System.out.print(counter + "  ");
                    counter ++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no. of rows : ");
        int num = sc.nextInt();

        floyds_traingle(num);

        sc.close();
    }
}
