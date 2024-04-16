package InterviewPractise;

public class Armstrong {

    public static void main(String[] args) {
      //  int a =153;
        int a = 151;
        int b = a;
        int sum=0;
        while(a>0)
        {
            int remainder = a%10;
         //   sum = sum+remainder*remainder*remainder; // armstrong
            sum = sum*10+remainder;  //palindrome
            a=a/10;
        }

        System.out.println(sum);

if(sum==b)
{
    System.out.println("It is a palindrome");
}
else {
    System.out.println("It is not a palindrome");
}


    }
}
