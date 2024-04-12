package InterviewPractise;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class uniquepairs {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,3,5,1,4};
        System.out.println("Pairs are "  +countUnique(arr));
    }

    static int countUnique(int arr[])
    {
        Set<Point> s = new HashSet<>();

        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                s.add(new Point(arr[i],arr[j]));
            }
        }

        for ( Point p:s)
        {
            System.out.println("("+p.x+ " , "+p.y+")");
        }

return s.size();

    }
}
