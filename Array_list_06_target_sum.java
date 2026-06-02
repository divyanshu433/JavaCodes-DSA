import java.util.ArrayList;

public class Array_list_06_target_sum {
    public static ArrayList<Integer> targetSum(ArrayList <Integer> arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = arr.size() - 1;
        while(i < j){
            int curr1 = arr.get(i);
            int curr2 = arr.get(j);
            if(curr1 + curr2 == target){
                ans.add(curr1);
                ans.add(curr2);
                return ans;
            }
            else if(curr1 + curr2 < target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(8);
        arr.add(35);
        arr.add(86);
        arr.add(343);
        System.out.println(targetSum(arr, 43));
    }
}
