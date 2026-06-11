import java.util.*;

public class Stack_05_next_greatest_num {

    public static void next_greatest_num(int arr[], int ans[]){
        Stack<Integer> stk = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr[stk.peek()];
            }
            stk.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int arr2[] = {9, 1, 7, 3, 2, 8};
        int ans[] = new int[arr.length];

        next_greatest_num(arr, ans);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
