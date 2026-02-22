import java.util.Scanner;

public class patterns_0_1_triangle {

    public static void triangle (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    if (j % 2 == 0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                else{
                    if (j % 2 == 0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter rows : ");
        int num = sc.nextInt();

        triangle(num);

        sc.close();
    }
}
