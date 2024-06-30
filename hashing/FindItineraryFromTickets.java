package hashing;

import java.util.HashMap;

public class FindItineraryFromTickets {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>(); // this will store the to -> from data
        for (String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        if (start == null) {
            System.out.println("Invalid tickets: No starting point found.");
            return;
        }

        while (start != null && tickets.containsKey(start)){
            String next = tickets.get(start);
            System.out.print(start + " -> " + next);
            start = next;
            if (start != null && tickets.containsKey(start)) {
                System.out.print(" ");
            }
        }
    }
}
