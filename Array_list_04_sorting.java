import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_list_04_sorting {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        
        Collections.sort(list);

        System.out.println(list);
        sc.close();
    }
}
