import java.util.ArrayList;

public class Array_list_07_target_sum_rotated_arr {

    public static boolean rotatedSum (ArrayList <Integer> list, int target, ArrayList<Integer> ans){
        int OStart = 0;
        int OEnd = list.size() - 1;

        for(int  i = 0 ; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                OStart = i + 1;
                OEnd = i;
            }
        }

        while(OStart != OEnd){

            /////Can remove these 2 if statements if using modular Airthmetic///
            if(OStart == list.size()){
                OStart = 0;
            }
            if(OEnd == -1){
                OEnd = list.size() - 1;
            }
            ///////////////////////////////

            if(list.get(OStart) + list.get(OEnd) == target){
                ans.add(list.get(OStart));
                ans.add(list.get(OEnd));
                return true;
            }

            else if(list.get(OStart) + list.get(OEnd) < target){
                OStart++;
                // OStart = (OStart + 1) % list.size();
            }
            else{
                OEnd--;
                // OEnd = (OEnd + list.size() - 1) % list.size();
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        ArrayList <Integer> ans = new ArrayList<>();

        if(rotatedSum(list, 15, ans)){
            System.out.println("The Pair is : ");
            System.out.println(ans);
        }
        else{
            System.out.println("Pair dosnt exist!!");
        }

    }
}
