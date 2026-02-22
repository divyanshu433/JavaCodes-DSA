import java.util.*;

public class prime_number{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number to check : ");
        int num = sc.nextInt();

        if ((num == 0) || (num == 1)){
            System.out.print("NOT PRIME");
        }
        else if (num == 2) {
            System.out.print("PRIME");
        }

        int count = 0;
        if(num > 2){
            for (int i = 2; i < num; i++){
              if (num % i == 0){
                   count += 1;
                break;
               }
            }
            
            if(count == 1){
                System.out.print("NOT PRIME");
            }
            else{
                System.out.print("PRIME");
            }
        }
        sc.close();
    }
}