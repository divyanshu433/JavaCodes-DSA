public class string_01 {

    public static void print_string (String str){
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String first_name = "Divyanshu";
        String last_name = "Gupta";
        String full_name = first_name + " " + last_name;

        print_string(full_name);
    }
}
