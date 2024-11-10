package InterviewPractise;

import java.util.ArrayList;
import java.util.List;

public class OccuranceLetters {


    public static void main(String[] args) {
        {
            String k = "riyazbashashaik";
            ArrayList<Character> al = new ArrayList<>();
            for (int i = 0; i < k.length(); i++) {
                int count = 0;
                if (!al.contains(k.charAt(i))) {
                    count++;
                    al.add(k.charAt(i));
                    for (int j = i + 1; j < k.length(); j++) {
                        if (k.charAt(i) == k.charAt(j)) {

                            count++;
                        }
                    }
                    System.out.println("The character " + k.charAt(i) + " " + count+ " times :>");
                }
            }
        }
    }
}
