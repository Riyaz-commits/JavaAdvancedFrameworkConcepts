package PractiseProgs;

import java.util.*;

public class PractiseJ {

    public static void main(String[] args) {

        // List Set Map
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Zebra");
        al.add("Sun");
        al.add("Dune");
        al.add("Zebra");
        al.add("Dune");
        System.out.println(al.get(2));
        al.remove(2);
        Collections.sort(al);
        System.out.println(al);
       Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        System.out.println("The elements are "+al);

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Zebra");
        set.add("Sun");
        set.add("Dune");
        set.add("Zebra");
        set.add("Dune");
        System.out.println("The elements of set are "+set);


        for( String   values1 :set)
        {
            System.out.println(values1);
        }


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2,"riyaz");
        hm.put(92,"riyazwertg");
        hm.put(43,"riyazwertg");
        hm.put(44,"riyazwertg");
        hm.put(4,"riyazwertg");
        hm.put(5,"riyazwertg");
        hm.put(null,"riyazwertg");
        hm.put(null,null);
        hm.put(null,"23432ef");


        for (Map.Entry<Integer, String> map1 :hm.entrySet())
        {
            System.out.println(map1.getKey()+""+map1.getValue());
        }


        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(2,"riyaz");
        tm.put(92,"riyazwertg");
        tm.put(43,"riyazwertg");
        tm.put(44,"riyazwertg");
        tm.put(4,"riyazwertg");
        tm.put(5,"riyazwertg");



        for (Map.Entry<Integer, String> map :hm.entrySet())
        {
            System.out.println(map.getKey()+""+map.getValue());
        }




    }
}
