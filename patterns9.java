import java.util.*;

public class patterns9 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Length : ");
        int len = sc.nextInt();

        System.out.print("Enter Width : ");
        int wid = sc.nextInt();

        for (int r = 1; r <= wid; r++){
            for(int c = 1; c <= len; c++){
                if((r == 1)||(r == wid)){
                    System.out.print("* ");
                }
                else if((c == 1)||(c == len)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
