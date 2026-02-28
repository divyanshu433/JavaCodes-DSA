public class string_03_shortest_path {

    public static float shortest_path (String str){
        int n = str.length();
        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            if (str.charAt(i) == 'E'){
                x++;
            }
            else if (str.charAt(i) == 'W'){
                x--;
            }
            else if (str.charAt(i) == 'N'){
                y++;
            }
            else if (str.charAt(i) == 'S'){
                y--;
            }
        }
        float path = (float) Math.sqrt(x*x + y*y);
        return path;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(shortest_path(path));
    }
}
