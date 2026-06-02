import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list_09_lonely_num {

    public static ArrayList<Integer> lonely_num(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();

        Collections.sort(list);

        for(int i = 1; i < list.size() - 1; i++){
            int prev = list.get(i - 1);
            int curr = list.get(i);
            int succ = list.get(i + 1);

            if(curr != prev && curr != succ && prev != curr - 1 && succ != curr + 1){
                ans.add(curr);
            }           
        }
        if(list.size() == 1){
            ans.add(list.get(0));
        }
        else{
            if(list.get(0) + 1 != list.get(1) && list.get(0) != list.get(1)){
                ans.add(list.get(0));
            }
            if((list.get(list.size() - 1) != list.get(list.size() - 2) + 1) && (list.get(list.size() - 1) != list.get(list.size() - 2))){
                ans.add(list.get(list.size() - 1));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println(lonely_num(list));
    }
}
