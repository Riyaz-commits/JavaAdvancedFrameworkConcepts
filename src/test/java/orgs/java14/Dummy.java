package orgs.java14;

public class Dummy {

    public static void main(String[] args) {

        Dummy k = new Dummy();
        k.m1();
        System.out.println("Main method");

    }

    void m1()
    {
        Dummy k = new Dummy();
        k.m2();
        int i =34;
        System.out.println("Hey this is m1 "+i);
    }

    void m2()
    {

        int i =91;
        System.out.println("Hey this is m2 "+i);
    }

}
