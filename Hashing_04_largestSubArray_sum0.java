import java.util.HashMap;

public class Hashing_04_largestSubArray_sum0 {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10};
        HashMap <Integer, Integer> map = new HashMap<>();
        // (sum, idx) pair
        int sum = 0;
        int MaxLen = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                MaxLen = Math.max(MaxLen, j - map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        System.out.println(MaxLen);
    }
}
