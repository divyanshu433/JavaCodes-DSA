import java.util.*;

public class avg_of_num{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();

        int sum = a+b+c;
        float avg = sum/3;

        System.out.println("Average of numbers is : "+avg);
        sc.close();
    }
}