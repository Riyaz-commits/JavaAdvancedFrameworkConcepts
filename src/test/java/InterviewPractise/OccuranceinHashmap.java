package InterviewPractise;

import java.util.HashMap;
import java.util.Map;

public class OccuranceinHashmap {
    public static void main(String[] args) {
        String s= "shaikriyazbashashaik";
        HashMap<Character,Integer> hm = new HashMap<>();

        char[] strarray = s.toCharArray();

        for (char c : strarray)
        {
            if(hm.containsKey(c)){

                hm.put(c,hm.get(c)+1);
            }
            else {
                hm.put(c,1);
            }
        }

        for(Map.Entry entry : hm.entrySet())
        {
            System.out.println(entry.getKey()+" repeated "+entry.getValue()+" times" );
        }
    }
}
