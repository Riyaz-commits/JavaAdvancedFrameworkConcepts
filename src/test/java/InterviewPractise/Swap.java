package InterviewPractise;

public class Swap {
    public static void main(String[] args) {
        int a =10,b=30;

         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println(a +" "+b);


        String s = "riyaz", r="basha";

        s=s+r;
        r=s.substring(0,s.length()-r.length());
        s=s.substring(r.length());
        System.out.println(s+"  "+r);
    }
}
