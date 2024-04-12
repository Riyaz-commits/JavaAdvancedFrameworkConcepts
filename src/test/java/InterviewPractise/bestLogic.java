package InterviewPractise;

public class bestLogic {

    public static void main(String[] args) {
        String s = "aabbccddd";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                System.out.print(s.charAt(i));
            } else {
                int val = Character.getNumericValue(s.charAt(i));
            for (int j=1;j<val;j++)
            {System.out.print(s.charAt(i-1));}
        }
    }
}}
