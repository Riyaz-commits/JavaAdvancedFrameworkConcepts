package InterviewPractise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPractiseStream {

    public static void main(String[] args) {
        int arr[] = {45, 68, 1, 34, 60, 49};

        // converting the arrays to stream pipeline
        // using limit to get 1st n values
        //IntStream is the return type of integer arrays
        IntStream sorted = Arrays.stream(arr).sorted();
        sorted.limit(4).forEach(e -> System.out.println(e));


        //reduce method
        //to add the sum of the numbers result=result+i
        OptionalInt reduce = Arrays.stream(arr).reduce((e1, e2) -> e1 + e2);

        if (reduce.isPresent()) {
            System.out.println(reduce.getAsInt());
        }
        //to sum the values and sort the values
        List<Integer> list = List.of(5, 6, 1, 53, 25, 26);
        Optional op = list.stream().max(Comparator.reverseOrder());
        System.out.println(op.get());

        // to sort the values in the list
        Comparator<Integer> comp = (num1, num2) -> {
            if (num1 > num2) {
                return -1;
            } else if (num1 < num2) {
                return +1;
            } else return 0;
        };
        System.out.println("Sorting the list using comparator");
        list.stream().sorted(comp).forEach(e -> System.out.println(e));
        System.out.println("Reverse Sorting the list using comparator");
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
    }
}
