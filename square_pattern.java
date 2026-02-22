import java.util.*;

public class square_pattern{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter side of square : ");
        int side = sc.nextInt();

        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }sc.close();
    }
}