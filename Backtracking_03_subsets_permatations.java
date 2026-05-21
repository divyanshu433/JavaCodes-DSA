public class Backtracking_03_subsets_permatations {

    public static void permuatation (String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permuatation(newstr, ans + currchar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permuatation(str, "");
    }
}
