public class array2D_search_key_num {
    
    public static void key_occur (int matrix[][], int key){
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("COUNT OF KEY IS : " + count);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {3, 6, 7, 9},
                          {12, 34, 45, 67}};
        int key = 3;

        key_occur(matrix, key);
    }
}
