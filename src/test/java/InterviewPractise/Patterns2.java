package InterviewPractise;

public class Patterns2 {
    public static void main(String[] args) {
        int l=0;
        int count =0;
        for (int i=1;i<=10;i++)
        {
            for (int k=1; k<=10-i; k++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {

               System.out.print(l+++" ");  //reverse triangle
             //   System.out.print(count+i);
            }
            System.out.println("");
        }
    }
}
