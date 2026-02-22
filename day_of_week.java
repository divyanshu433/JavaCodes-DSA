import java.util.*;

public class day_of_week{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your day in week (1-7) : ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.print("MONDAY");
                break;

            case 2:
                System.out.print("TUESDAY");
                break;

            case 3:
                System.out.print("WEDDAY");
                break;

            case 4:
                System.out.print("THURSDAY");
                break;

            case 5:
                System.out.print("FRIDAY");
                break;

            case 6:
                System.out.print("SATURDAY");
                break;

            case 7:
                System.out.print("SUNDAY");
                break;

            default:
                System.out.print("INVALID INPUT");
        }
        sc.close();


    }
}