import java.util.*;

public class patterns5 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
