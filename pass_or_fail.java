import java.util.*;

public class pass_or_fail {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        String status = (marks >= 33) ? "PASS": "FAIL";

        System.out.print(status);
        sc.close();
    }
    
}
