import java.util.*;
public class Queue_06_first_non_rep {

    public static String non_rep(String str){
        Queue <Character> q = new LinkedList<>();
        int freq[] = new int[26];
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i  < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            if(!q.isEmpty()){
                sb.append(q.peek() + " ");
            }
            else{
                sb.append(-1 + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(non_rep(str));
    }
}
