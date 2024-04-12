package orgs;
import java.util.regex.*;

public class Patterns {
    public static void main(String[] args) {
        String str = "My Name is maximus aged 45 crown 2 times for germany";
        Pattern pattern = Pattern.compile("maximus");
        Matcher matcher = pattern.matcher(str);
      //  Pattern p = Pattern.compile("My Name is (\\d+) aged 45 crown 2 times for germany");
        boolean found = false;
        while (matcher.find()) {
            System.out.println("I found the text "+matcher.group()+" starting at index "+
                    matcher.start()+" and ending at index "+matcher.end());
            found = true;
        }



   /* final String sentence = "my name is Sumeet and empid is 1234";
    Pattern pattern1 = Pattern    .      compile("my name is (\w+) and empid is (\d+)");
    Matcher matcher1 = pattern    .      matcher(sentence);
        matcher1.find();
        System.out.println("name = "+matcher1    .      group(1));
        System    .      out    .      println("Empid = "+matcher1    .      group(2));*/
}
}