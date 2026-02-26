import java.util.*;

public class array2D_01 {

    public static void search (int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == key){
                    System.out.print("Found at : " + "(" + i + "," + j + ")");
                }  
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter key to search : ");
        int key = sc.nextInt();

        search(matrix, key);
        
        sc.close();
    }
}
