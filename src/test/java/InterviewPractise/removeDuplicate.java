package InterviewPractise;

import java.util.HashSet;

public class removeDuplicate {

    public static void main(String[] args) {
        String s ="aaaariyaaazzzbaaashaaaa";
        HashSet<Character> hs = new HashSet<>();
        for (int i=0;i<s.length()-1;i++)
        {
            hs.add(s.charAt(i));
        }

        System.out.println(hs);
    }
}
