package varaPractise;

class Parent{
    Parent(String msg) {
        System.out.println("Parent : " + msg);
    }

        void greet(String name)
        {
            System.out.println("Hello i am parent  class "+name);
        }
    }

class Child extends Parent{
    Child(String msg) {
       super(msg);
    }

    void greet(String name)
    {
super.greet(name);
        System.out.println("Hello i am child  class "+name);
    }
}
    public class Demo{


        public static void main(String[] args) {
            Child c = new Child("Hello");
            c.greet("new year");
        }


}