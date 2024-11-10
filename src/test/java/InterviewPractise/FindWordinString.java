package InterviewPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordinString {
    public static void main(String[] args) {

        String s =" My Name is Riyaz Basha shaik";
        Pattern p = Pattern.compile("Riyaz Basha");
        Matcher m =p.matcher(s);
        if (m.find()){
            System.out.println(m.start() +"  "+m.end()+m.group());
        }
        else
        {
            System.out.println("Not matched");
        }

    }
}
