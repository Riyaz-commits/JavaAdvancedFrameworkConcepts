package InterviewPractise;

public class ReverseWord {

    public static void main(String[] args) {
        String st = "Riyaz Basha Shaik";

     /*   StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
        String st = new String(sb);*/
      String val[]=  st.split(" ");
      String rev="";
      for (int i=0;i<=val.length-1;i++)
        {

            rev= val[i]+" "+rev;

        }
        System.out.println(rev);
    }
}
