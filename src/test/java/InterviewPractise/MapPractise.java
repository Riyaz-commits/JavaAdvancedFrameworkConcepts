package InterviewPractise;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();

        hm.put("Riyaz","Basha");
        hm.put("Shaik","IBM");
        System.out.println(hm.get("Riyaz"));
        for(Map.Entry<String,String> map: hm.entrySet())
        {
            System.out.println(map.getKey()+"  "+map.getValue());

        }
    }
}
