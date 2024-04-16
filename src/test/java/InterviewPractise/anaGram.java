package InterviewPractise;

import java.util.Arrays;

public class anaGram {

    public static void main(String[] args) {
        String s1 = "cried";
        String s2 = "cider";
        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result = Arrays.equals(c1, c2);
            if (result) {
                System.out.println(s1 + " and " + s2 + " are anagram ");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagram ");
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagram ");
        }
    }
}
