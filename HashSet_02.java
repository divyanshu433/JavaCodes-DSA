import java.util.HashSet;
import java.util.Iterator;

public class HashSet_02 {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();

        hs.add("Delhi");
        hs.add("Barcelona");
        hs.add("Milan");
        hs.add("Pune");
        hs.add("Manchester");

        Iterator i = hs.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println();

        for(String cities : hs){
            System.out.println(cities);
        }
    }
}
