package orgs.java14;

public class Palindrome1 {

    public static void main(String[] args) {
        int i =353;
        int original =i;
        int remainder;
        int sum=0;
        while (i>0)
        {
           remainder= i%10;
           sum= sum*10+remainder;
           i=i/10;

        }

        if (sum==original)
        {
            System.out.println("It is a Palindrome");
        }

        else
        {
            System.out.println("It's not a Palindrome");
        }
    }
}
