import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_list_03_swap_2_num {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println(list);
        int idx1 = 1;
        int idx2 = 3;

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
        sc.close();
    }
}
