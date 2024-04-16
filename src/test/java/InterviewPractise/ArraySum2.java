package InterviewPractise;

import java.util.*;
import java.util.stream.Collectors;

public class ArraySum2 {

    public static void main(String[] args) {
        int arr[] = {21, 29, 22, 23, 28, 27, 23};
  Set<Integer> ar=Arrays.stream(arr).map(e->e).boxed().collect(Collectors.toSet());
        System.out.println(ar.stream().sorted());
      List<Integer> li = ar.stream().collect(Collectors.toList());
        for (int i = 0; i <= li.size() - 1; i++) {


            for (int j = i + 1; j > 0 && j <= li.size() - 1; j++) {
                {
                if (li.get(i) + li.get(j) == 50) {
                    System.out.println("These are pair " + li.get(i) + " and " + li.get(j));
                } else {

                }}
            }}
        }
    }


