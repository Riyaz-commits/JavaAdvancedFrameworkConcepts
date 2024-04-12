package InterviewPractise;

public class Arraysum {

    public static void main(String[] args) {

        int arr[] = {10,40,45,4,32,01,33,41};

        for(int i=0; i<=arr.length-1;i++)
        {
            int sum=0;
            int val = arr[i];

            while (val>0)
            {
                int remainder = val%10;
                sum=sum+remainder;
                val=val/10;
            }
            if(sum==5)
            {
                System.out.println(arr[i]);
            }

        }

    }
}
