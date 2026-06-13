import java.util.Stack;

public class Stack_08_max_rectangular_area {

    public static int maxArea(int arr[]){
        int max = 0;
        int nxtSRight[] = new int[arr.length];
        int nxtSLeft[] = new int[arr.length];
        
        Stack <Integer> stk = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nxtSRight[i] = arr.length;
            }
            else{
                nxtSRight[i] = stk.peek();
            }
            stk.push(i);
        }


        stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nxtSLeft[i] = -1;
            }
            else{
                nxtSLeft[i] = stk.peek();
            }
            stk.push(i);
        }

        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i] * (nxtSRight[i] - nxtSLeft[i] - 1));
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4};
        System.out.println("Max area in histogram : " + maxArea(arr));
    }
}
