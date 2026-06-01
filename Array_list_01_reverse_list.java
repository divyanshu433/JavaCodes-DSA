import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_list_01_reverse_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}
