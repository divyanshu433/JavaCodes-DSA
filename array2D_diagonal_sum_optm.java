public class array2D_diagonal_sum_optm {

    public static void diagonal_sum (int mat[][]){
        int n = mat.length;
        int sum = 0;
        int exception = 0;
        for (int i = 0; i < n; i++){
            sum += mat[i][i];

            sum += mat[i][n - 1- i];

            if ((n % 2 != 0) && (i == (n - 1) / 2)){
                exception = mat[i][i];
            }
        }
        sum -= exception;
        System.out.println("Diagonal sum : " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};

        int matrix2[][] = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        diagonal_sum(matrix);
        diagonal_sum(matrix2);
    }
}
