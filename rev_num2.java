import java.util.*;

public class rev_num2{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number to reverse : ");
        int num = sc.nextInt();
        int lst_dig;
        int rev = 0;

        while (num > 0){
            lst_dig = num % 10;
            rev = (rev*10) + lst_dig;
            num = num / 10;
        }
        System.out.print(rev);
        sc.close();
    }
}