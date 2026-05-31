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

        int idx1 = 1;
        int idx2 = 3;
        list(idx1) = list(idx1) ^ list(idx2);
        list(idx2) = list(idx1) ^ list(idx2);
        list(idx1) = list(idx1) ^ list(idx2);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
