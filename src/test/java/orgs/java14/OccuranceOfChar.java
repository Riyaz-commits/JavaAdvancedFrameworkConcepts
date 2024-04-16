package orgs.java14;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

    public static void main(String[] args) {
        String name = "snigdasnigdasnigda";
        count_char(name);
    }

    static void count_char(String input_str) {
        HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
        char[] str_array = input_str.toCharArray();
        for (char c : str_array) {
            if (my_map.containsKey(c)) {
                my_map.put(c, my_map.get(c) + 1);
            } else {
                my_map.put(c, 1);
            }
        }

        for (Map.Entry entry : my_map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
