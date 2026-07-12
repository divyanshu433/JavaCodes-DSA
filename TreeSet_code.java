import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_code {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Barcelona");
        hs.add("Milan");
        hs.add("Pune");
        hs.add("Manchester");

        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Barcelona");
        lhs.add("Milan");
        lhs.add("Pune");
        lhs.add("Manchester");

        TreeSet <String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Barcelona");
        ts.add("Milan");
        ts.add("Pune");
        ts.add("Manchester");


        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }
}
