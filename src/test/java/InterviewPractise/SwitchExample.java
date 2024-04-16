package InterviewPractise;

import com.google.gson.JsonParseException;

public class SwitchExample {

    public static void main(String[] args) {
        int i=10;
        int j;
        final int k=10;

        if (i==10)
        {
            j=14;
        }
        else if (k==10)
        {
            j=30;
        }
        System.out.println(j);

        switch (j)
        {
            /*case 1:
                System.out.println("This is for 1");
                break;
            case 10:
                System.out.println("This is for 10");
            break;
            case 11:
                System.out.println("This is for 11");
                break;

            case 14:
                System.out.println("This is after default case 14");
                break;*/
            default:
                System.out.println("This is default");
                break;
        }
    }


}
