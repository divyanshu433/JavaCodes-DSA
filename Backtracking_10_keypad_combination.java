import java.util.ArrayList;
import java.util.List;

public class Backtracking_10_keypad_combination {

    public static void combinations(String keypad[], String digits, int idx, String curr, List <String> ans){
        if(idx == digits.length()){
            ans.add(curr);
            return;
        }

        int num = digits.charAt(idx) - '0';
        for(int i = 0; i < keypad[num].length(); i++){
            char ch = keypad[num].charAt(i);
            String newcurr = curr + ch;
            combinations(keypad, digits, idx + 1, newcurr, ans);
        }
    }
    
    public static void main(String[] args) {
        String keypad[] = new String[10];
        keypad[2] = "abc";
        keypad[3] = "def";
        keypad[4] = "ghi";
        keypad[5] = "jkl";
        keypad[6] = "mno";
        keypad[7] = "pqrs";
        keypad[8] = "tuv";
        keypad[9] = "wxyz";

        List <String> ans = new ArrayList<>();

        combinations(keypad, "23", 0, "", ans);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }

    }
}
