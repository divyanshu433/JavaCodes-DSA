import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_list_02_find_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int max = Integer.MIN_VALUE;
        for(int i = list.size() - 1; i >= 0; i--){
            max = Math.max(max , list.get(i));
        }

        System.out.println(max);
    }
}
