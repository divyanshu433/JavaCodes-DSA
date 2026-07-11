import java.util.*;

public class LinkedHashMap_code {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("US", 30);
        lhm.put("Norway", 15);
        lhm.put("Spain", 20);

        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("US", 30);
        hm.put("Norway", 15);
        hm.put("Spain", 20);

        System.out.println(hm);
    }
}