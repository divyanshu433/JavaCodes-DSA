import java.util.*;

public class patterns_10{

    public static void hollow_rectangle (int len, int wid){
        for (int c = 1; c <= wid; c++){
            for (int r = 1; r <= len; r++){
                if ((c == 1) || (c == wid) || (r == 1) || (r == len)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter length : ");
        int len = sc.nextInt();

        System.out.print("Enter width : ");
        int wid = sc.nextInt();

        hollow_rectangle(len, wid);

        sc.close();
    }
}