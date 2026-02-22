public class array_05_sub_array {

    public static void sub_array (int num[]){
        int total = 0;
        for (int i = 0; i < num.length; i++){
            for (int j = i; j < num.length; j++){
                for (int k = i; k <= j; k++){
                    System.out.print(num[k] + " ");
                }
                total ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total sub arrays : " + total);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};

        sub_array(num);
    }
}
