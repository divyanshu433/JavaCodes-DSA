public class Recursion_28_remove_dub {

    public static void remove_dub (String str, int idx, StringBuilder newStr, boolean arr[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if(arr[curr - 'a'] == true){
            remove_dub(str, idx + 1, newStr, arr);
        }
        else{
            arr[curr - 'a'] = true;
            remove_dub(str, idx + 1, newStr.append(curr), arr);
        }

    }

    public static void main(String[] args) {
        String str = "yoyo";
        remove_dub(str, 0, new StringBuilder (""), new boolean [26]);
    }
}
