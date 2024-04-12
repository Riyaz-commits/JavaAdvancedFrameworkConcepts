package InterviewPractise;

public class Recusrion {

    public static void main(String[] args) {

        int k = 10;
        System.out.println(recurvalue(k));
    }

    public static int recurvalue(int k) {
        int fact = 1;
        if (k > 0) {
            return k * recurvalue(k - 1);
        } else {

        }


        return 1;
    }
}