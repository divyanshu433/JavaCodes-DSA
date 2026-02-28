public class array2D_diagonal_sum {

    public static void diagonal_sum (int mat[][]){
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if((i == j) || (i + j == n - 1)){
                    sum += mat[i][j];
                }
            }
        }
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
