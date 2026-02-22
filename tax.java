import java.util.*;

public class tax{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter income : ");
        int income = sc.nextInt();
        float tax = 0;

        if (income < 500000){
            tax = 0;
        }
        else if ((income >= 500000) && (income <= 1000000)){
            tax = 0.2f*income;
        }
        else if (income > 1000000){
            tax = 0.3f*income;
        }
        else{
            System.out.print("INVALID INPUT");
        }

        System.out.print("TAX is : " +tax);
        sc.close();
    }
}