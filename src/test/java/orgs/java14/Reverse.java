package orgs.java14;

public class Reverse {

    public static void main(String[] args) {
        String name= "Riyaz Basha Shaik";
        String rev="";
        StringBuilder sb = new StringBuilder(name);
     //   sb.reverse();
        String ns = new String(sb);
     String [] sar=   ns.split(" ");
        for (int i= sar.length-1;i>=0;i--)
        {
         // rev = sar[i]+" "+rev;
           rev = rev+" "+sar[i];
        }
        System.out.println(" Reverse of a string is "+rev);


      //  System.out.println(sb);

      //  sb = sb.reverse();
      //  System.out.println(sb);
    }
}
