public class Backtracking_09_rat_in_a_maze {

    public static int rat_in_a_maze (int maze[][], int i, int j, int m, int n){
        if(i == m - 1 && j == n - 1){
            return 1;
        }
        if(i == m || j == n){
            return 0;
        }
        if(maze[i][j] == 0){
            return 0;
        }


        int w1 = rat_in_a_maze(maze, i + 1, j, m, n);
        int w2 = rat_in_a_maze(maze, i, j + 1, m, n);
        return w1 + w2;
    }

    

    public static void printGrid(int maze[][]){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { 
            { 1, 1, 1, 1 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 1 },
            { 1, 1, 1, 1 }};

        System.out.println("Possible sol = " + rat_in_a_maze(maze, 0, 0, maze.length, maze[0].length));
    }
}
