package org.java14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java14Ex {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);

        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);

    long cnt=list.stream().count();
      //  list.stream().skip(cnt-3)
          //      .forEach(e-> System.out.println(e));


        // to use takewhile consider a list has 1,4,6,4,5,3 so when we use condistion i->i<5 it consider it meets
        //threshold 1,4 will print

      int k=  list.stream().mapToInt(i->i).sum();
        System.out.println(k);

       List l= list.stream().takeWhile(i->i < 5).collect(Collectors.toList());

        System.out.println(l);




    }
}
