package orgs.java14;

public class Fibonacci {

    public static void main(String[] args) {

        int i1=0,i2=1; int i3=0;

        System.out.println(i1);
        int n=1;
        while(n<10)
        {
            i3=i1+i2;
            i1=i2;
       //     System.out.println(i2);
            System.out.println(i3);
            i1=i2;
            i2=i3;
            n++;

        }
    }
}
