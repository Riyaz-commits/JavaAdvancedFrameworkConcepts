package InterviewPractise;

public class AABBCCa2b2c2 {

    public static void main(String[] args) {
        String s = "aabbcccdddd";

     //   if (s.charAt(x) != s.charAt(x + 1) && count == 1) ⇒ print the counter and character;
        //if (s.charAt(x) == s.charAt(x + 1)) ⇒ increase the counter;
        //if (s.charAt(x) != s.charAt(x + 1) && count >= 2) ⇒ reset to counter 1.

        {
            int count= 1;
            int i;

            for (i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1) && count == 1) {
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                } else if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else if (s.charAt(i) != s.charAt(i + 1) && count >= 2) {
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                    count = 1;
                }
            }
           System.out.print(s.charAt(i));
            System.out.println(count);
        }
    }
}
