public class arrays2D_spiral_matrix {

    public static void spiral (int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int start_row = 0;
        int start_column = 0;
        int end_row = n - 1;
        int end_column = m - 1;

        while((start_row <= end_row) && (start_column <= end_column)){
            for (int i = start_column; i <= end_column; i++){
                System.out.print(matrix[start_row][i] + " ");
            }

            for (int i = start_row + 1; i <= end_row; i++){
                System.out.print(matrix[i][end_column] + " ");
            }

            for (int i = end_column - 1; i >= start_column; i--){
                if (start_row == end_row){
                    break;
                }
                System.out.print(matrix[end_row][i] + " ");
            }

            for (int i = end_row - 1; i >= start_row + 1; i--){
                if (start_column == end_column){
                    break;
                }
                System.out.print(matrix[i][start_column] + " ");
            }

            start_row++;
            start_column++;
            end_row--;
            end_column--;
        }
        System.out.println();
    }

    public static void print_matrix (int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        int matrix2[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

    // print_matrix(matrix);

    spiral(matrix);
    spiral(matrix2);
   }
}
