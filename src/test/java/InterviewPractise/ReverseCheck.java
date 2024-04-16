package InterviewPractise;

public class ReverseCheck {

    public static void main(String[] args) {
        String s = "SHIAKSDET";

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        String k = "";
        for(int i=0; i<s.length();i++)
        {
            k = s.charAt(i) +k;
        }

        System.out.println("Reverse order is "+k);


        if(s.equalsIgnoreCase(k))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
