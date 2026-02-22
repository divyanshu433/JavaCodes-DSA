import java.util.*;

public class Area_of_square{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter side of square : ");
        float s = sc.nextFloat();
        float area = s*s;
        System.out.print("Area of square is : "+area);
        sc.close();

    }
}