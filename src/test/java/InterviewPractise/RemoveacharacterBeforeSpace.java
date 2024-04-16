package InterviewPractise;

public class RemoveacharacterBeforeSpace {

    public static void main(String[] args) {
        String str = "+8860 933830907";
        int index = str.indexOf(" ");
        String word = str.substring(0, index);
        String phn = str.substring(index);
        System.out.println(phn);
        System.out.println(word);

        System.out.println(word.length() + "size of "+word);

        if (word.length() >= 3) {
            word = word.replace(String.valueOf(word.charAt(4)), "");
        }

        String java="1234";

        if(java!=null && !java.isEmpty())
        {
            System.out.println("Hey its a Empty");
        }

        System.out.println(word + phn);
    }
}
