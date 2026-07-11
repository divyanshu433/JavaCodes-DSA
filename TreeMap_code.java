import java.util.TreeMap;

public class TreeMap_code {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("US", 30);
        tm.put("Norway", 15);
        tm.put("Spain", 20);

        System.out.println(tm);
    }
}
