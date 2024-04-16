package orgs.java14;

import java.util.HashMap;
import java.util.Map;

public class OccuranceusingMap {

    public static void main(String[] args) {
        String name = "My Name is Riyaz Basha shaik";
        countChars(name);

    }

    static void countChars(String name) {
        HashMap<Character, Integer> hm = new HashMap<>();
        name = name.toLowerCase().replace(" ", "");
        char[] namec = name.toCharArray();
        for (char itr : namec) {
            if (hm.containsKey(itr)) {
                hm.put(itr, hm.get(itr) + 1);
            } else {
                hm.put(itr, 1);
            }
        }
        for (Map.Entry fval : hm.entrySet()) {
            System.out.println(fval.getKey() + "  Repeated " + fval.getValue() + "  times");
        }
    }

}
