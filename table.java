import java.util.*;

public class table{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number to get table : ");
        int num = sc.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(num + " X " + i + " = " + (num * i));

        }
        sc.close();
    }
}