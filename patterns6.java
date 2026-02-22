import java.util.*;

public class patterns6 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter lenght of rectangle : ");
        int len = sc.nextInt();

        System.out.print("Enter width of rectangle : ");
        int wid = sc.nextInt();

        for (int i = 1; i <= wid; i++){
            for (int j = 1; j <= len; j++){
                if ((i != 1)||(i != wid)){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
