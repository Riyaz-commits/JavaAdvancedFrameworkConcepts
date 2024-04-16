package InterviewPractise;

public class Sorting2Dim {

    public static void main(String[] args) {
        int r[][]= {{1,2,3},{6,5,8},{10,4,9}};

        int max =r[0][0];

        for (int i=0;i<r.length;i++)
        {
            for (int j=0;j<r.length;j++)
            {
                if(r[i][j]>max)
                {
                    max=r[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
