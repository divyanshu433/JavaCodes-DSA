import java.util.*;

public class sum_of_numbers{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter numbers to get sum : ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= num){
            sum += i;
            i++;
        }

        System.out.print("The sum is : "+sum);
        sc.close();

    }
}