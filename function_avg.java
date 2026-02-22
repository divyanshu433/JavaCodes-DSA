import java.util.*;

public class function_avg {

    public static float avg (float a, float b, float c){
        float average = ( a + b + c ) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st number : ");
        float n1 = sc.nextFloat();

        System.out.print("Enter 2nd number : ");
        float n2 = sc.nextFloat();

        System.out.print("Enter 3rd number : ");
        float n3 = sc.nextFloat();

        System.out.print("Average of nums is : " + avg(n1, n2, n3));
        
        sc.close();
    }
    
}
