public class array2D_row_sum {
    public static void row_2_sum (int matrix[][]){
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++){
            sum += matrix[1][j];
        }
        System.out.println("SUM OF ROW 2 IS : " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 9},
                          {11, 4, 3},
                          {2, 2, 3}};

        row_2_sum(matrix);
    }
}
