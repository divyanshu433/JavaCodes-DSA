import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        // Create
        HashMap <String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("Norway", 10);
        hm.put("England", 15);
        hm.put("France", 30);
        hm.put("Argentina", 35);
        hm.put("Spain", 15);

        // System.out.println(hm);

        // // Get
        // int population = hm.get("India");
        // System.out.println(population);

        // // Conatins
        // System.out.println(hm.containsKey("India"));

        // // Remove
        // System.out.println(hm.remove("India"));

        Set <String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = " + k + ", Value = " + hm.get(k));
        }
    }
}
