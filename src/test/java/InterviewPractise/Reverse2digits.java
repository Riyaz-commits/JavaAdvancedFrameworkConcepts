package InterviewPractise;

import java.util.Scanner;

public class Reverse2digits {

    public static void main(String[] args) {
        String s ="123456";
    String temp="";
        System.out.println(s.charAt(0));
        StringBuilder sb = new StringBuilder(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sorting Number");
        int sorter =sc.nextInt();
        for (int i=0;i<s.length();i++)
        {
            if(i%sorter==0)
            {
              temp = temp+sb.charAt(i+1)+sb.charAt(i);
            }
        }
        System.out.println(
                temp);

    }
}
