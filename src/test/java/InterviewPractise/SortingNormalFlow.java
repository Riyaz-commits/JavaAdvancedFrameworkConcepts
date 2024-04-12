package InterviewPractise;

public class SortingNormalFlow {
    public static void main(String[] args) {
    int r[]= {3,2,5,7,14,65,1};
    int max=0;
    int secondHigst=0;
    for(int i=0;i<=r.length-1;i++)
    {
        if(r[i]>max)
        {
            secondHigst = max;
            max=r[i];
        }

    }
        System.out.println("1st highest "+max);
        System.out.println("2nd Highest "+secondHigst);
    }
}
