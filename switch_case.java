import java.util.*;

public class switch_case{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("MANGO");
                break;
            case 2:
                System.out.println("APPLE");
                break;
            case 3:
                System.out.println("BANANA");
                break;
            default:
                System.out.println("NOTHING YOU WILL GET");
        }
        sc.close();

    }
}