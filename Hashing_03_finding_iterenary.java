import java.util.ArrayList;
import java.util.HashMap;

public class Hashing_03_finding_iterenary {
    public static void main(String[] args) {
        HashMap <String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        HashMap <String, String> revTickets = new HashMap<>();
        for(String places : tickets.keySet()){
            revTickets.put(tickets.get(places), places);
        }
        String start = null;
        for(String key : tickets.keySet()){
            if(!revTickets.containsKey(key)){
                start = key;
            }
        }

        ArrayList <String> it = new ArrayList<>();

        it.add(start);
        
        for(String places : tickets.keySet()){
            it.add(tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println(it);

    }
}
