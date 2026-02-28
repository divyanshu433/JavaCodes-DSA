public class arrar2D_traspose_matrix {
    
    public static int[][] transpose (int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int trans[][] = new int [m][n];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static void print (int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6}};

        int trans_matrix[][] = transpose(matrix);

        print(trans_matrix);
    }
}
