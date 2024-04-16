package orgs.java14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile("(.+)@(.+).com");//. represents single character
        Matcher m = p.matcher("skriyazbasha91@gmail.com");
        boolean b = m.matches();

        //2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b+" "+b2+" "+b3);

        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)


        System.out.println(Pattern.matches("[^amn]", "1"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[a-zA-Z]", "a123"));//true (among a or m or n)
       String s ="wfd123^$#re34ABCD)$#09)";
      s= s.replaceAll("[a-zA-Z0-9]","");
        System.out.println("after replacing "+s);
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

    }
}
