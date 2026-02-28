import java.util.Scanner;

public class array2D_02_min_max {

    public static void search (int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == key){
                    System.out.println("Found at : " + "(" + i + "," + j + ")");
                }  
            }
        }
    }

    public static void min_max (int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }

                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("MAX element is : " + max);
        System.out.println("MIN element is : " + min);
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
        
        min_max(matrix);

        sc.close();
    }
}
