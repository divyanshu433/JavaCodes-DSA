import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_08_Monotonic_ArrayList {

    public static boolean Monotonic_ArrayList(ArrayList <Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                inc = false;
            }
            if(list.get(i) < list.get(i + 1)){
                dec =  false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println(Monotonic_ArrayList(list));
    }
}
