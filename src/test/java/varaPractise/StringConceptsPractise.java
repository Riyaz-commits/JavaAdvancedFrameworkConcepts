package varaPractise;

public class StringConceptsPractise {
    public static void main(String[] args) {

        String s = "Hi my name is alexa";
       int size =   s.length();
        System.out.println(size);

        char c = s.charAt(4);
        System.out.println(c);

       String sb= s.substring(5,9);
        System.out.println(sb);

      boolean b =  s.contains("Alexa");
        System.out.println(b);

        boolean b1 =  s.equalsIgnoreCase("Alexa");
        System.out.println(b);

        String n = "Vara";

       n= n.concat(" wel come  back  ");
        System.out.println(n);
    String k =n.toUpperCase();
        System.out.println(k.trim());

    }
}
