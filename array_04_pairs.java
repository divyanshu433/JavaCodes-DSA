public class array_04_pairs {

    public static void pairs (int numbers[]){
        int total_pairs = 0;
        for (int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            for (int j = i+1; j < numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                total_pairs ++;
            }
            System.out.println();
        }
        System.out.print("Total pairs : " + total_pairs);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};

        pairs(numbers);
    }
}
