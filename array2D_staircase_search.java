public class array2D_staircase_search {

    public static boolean staircase_search (int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;

        while ((row < n) && (col >= 0)){
            if (key == matrix[row][col]){
                System.out.println("FOUND AT : " + "(" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]){
                col--;
            }

            else if (key > matrix[row][col]){
                row++;
            }
        }
        System.out.println("NOT FOUND");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        
        int key = 33;

        staircase_search(matrix, key);
    }
}
