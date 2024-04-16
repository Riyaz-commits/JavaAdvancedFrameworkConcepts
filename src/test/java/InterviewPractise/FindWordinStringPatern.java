package InterviewPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordinStringPatern {
    public static void main(String[] args) {
    String s = "I am Riyaz Basha Shaik aged 25 ,born in Ch.Pet in 1997 ";
        Pattern p = Pattern.compile("Riyaz Basha Shaik");
      Matcher m= p.matcher(s);
      while (m.find()){
          System.out.println("I found the text "+m.group()+" starting at index "+
                  m.start()+" and ending at index "+m.end());
      }

    }
}
