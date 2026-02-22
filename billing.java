import java.util.*;

public class billing{
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter amount of Pencil : ");
        float Pencil = sc.nextFloat();

        System.out.print("Enter amount of Pen : ");
        float Pen = sc.nextFloat();

        System.out.print("Enter amount of Eraser : ");
        float Eraser = sc.nextFloat();

        float sum = Pencil + Pen + Eraser;
        float gst = (sum * 18)/100;
        float total = sum + gst;

        System.out.print("Total bill (inc. GST) : "+total);
        sc.close();
    }
}