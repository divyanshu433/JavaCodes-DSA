public class Recursion_11_remove_duplicates {

    public static void remove_Duplicates(String str, int idx, StringBuilder new_str, boolean arr[]){
        if (idx == str.length()){
            System.out.println(new_str);
            return;
        }
        
        char currChar = str.charAt(idx);
        if (arr[currChar - 'a'] == true){
            remove_Duplicates(str, idx + 1, new_str, arr);
        }
        else{
            arr[currChar - 'a'] = true;
            remove_Duplicates(str, idx + 1, new_str.append(currChar), arr);
        }
    }

    public static void main(String[] args) {
        String str = "football";
        remove_Duplicates(str, 0, new StringBuilder(""),new boolean [26]);
    }
}
