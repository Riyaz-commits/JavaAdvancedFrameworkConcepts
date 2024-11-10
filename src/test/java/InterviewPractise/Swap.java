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

    public static class RepeatWordInString {
        public static void main(String[] args) {
            String s = "happydaysundaymondaydaytuedaywedday";

            int day = s.indexOf("day");
            int count = 0;
            while (day != -1) {
                count++;
                day = s.indexOf("day", day + 1);
            }

            System.out.println(count);
        }

    }
}
