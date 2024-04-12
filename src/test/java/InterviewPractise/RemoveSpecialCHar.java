package InterviewPractise;

public class RemoveSpecialCHar {
    public static void main(String[] args) {
        String s = "This#t%&)*r*i&123y%a$z";

      String st=  s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(st);
    }
}
