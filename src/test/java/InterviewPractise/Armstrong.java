package InterviewPractise;

public class Armstrong {

    public static void main(String[] args) {
        int a =153;
        int sum=0;
        while(a>0)
        {
            int remainder = a%10;
          //  sum = sum+remainder*remainder*remainder; // armstrong
            sum = sum*10+remainder;  //palindrome
            a=a/10;
        }

        System.out.println(sum);




    }
}
