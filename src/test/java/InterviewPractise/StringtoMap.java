package InterviewPractise;

import java.util.HashMap;
import java.util.Map;

public class StringtoMap {

    public static void main(String[] args) {

        String s = "abcd";
        HashMap<Character,Character> hm = new HashMap<>();
        int i=0;
        while ( i<s.length()-1)
        {hm.put(s.charAt(i),s.charAt(i+1));
               i= i+1;
        }
        for (Map.Entry<Character,Character> mp:hm.entrySet()) {

            System.out.println(mp.getKey()+"  "+mp.getValue());

        }
    }
}
