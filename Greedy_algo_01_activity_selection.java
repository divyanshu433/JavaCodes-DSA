import java.util.ArrayList;

public class Greedy_algo_01_activity_selection {

    public static int activity_selection(int start[], int end[], ArrayList <String> list){
        int count = 0;

        //Activity 1
        list.add("A0");
        count++;
        int endTime = end[0];

        // rest of the activities
        for(int i = 1; i < end.length; i++){

            //Activity Selection
            if(start[i] >= endTime){
                endTime = end[i];
                list.add("A" + i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        ArrayList <String> list = new ArrayList<>();

        System.out.println(activity_selection(start, end, list));

        System.out.println(list);
    }
}
