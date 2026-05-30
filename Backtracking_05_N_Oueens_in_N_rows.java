public class Backtracking_05_N_Oueens_in_N_rows {

    public static void nQueens (char board[][], int i){
        if(i == board.length){
            printBoard(board);
            return;
        }
        for(int j = 0; j < board.length; j++){
            // checking condition if a queen can be placed there
            if(isSafe(board, i, j)){
                // placing Queens
                board[i][j] = 'Q';
                nQueens(board, i + 1);
                // removing queen for next step
                board[i][j] = '.';
            }
        }
    }

    public static boolean isSafe (char board[][], int row, int col){
        // vertically up direction
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left up Diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Right up Diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String args[]){
        int n = 1;
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
