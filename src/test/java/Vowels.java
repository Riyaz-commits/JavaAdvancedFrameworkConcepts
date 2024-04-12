import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static void main(String[] args) {
        String a = "Riyaz Basha Shaik";

        String a1 = a.toLowerCase();
        a1 = a1.replace(" ", "");
        String s = "aeiou";
        int countvowel = 0;
        int countConsonent = 0;
        for (int i = 0; i <= a1.length() - 1; i++) {
            String c = Character.toString(a1.charAt(i));
            if (s.contains(c)) {
                countvowel++;
            } else {
                countConsonent++;
            }
        }
        System.out.println("No.of Vowels are " + countvowel);
        System.out.println("No.of Vowels are " + countConsonent);



}}