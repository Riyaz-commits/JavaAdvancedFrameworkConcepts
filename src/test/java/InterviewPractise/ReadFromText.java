package InterviewPractise;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromText {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("C:\\Users\\RIYAZ BASHA SHAIK\\IdeaProjects\\Java8Selenium\\src\\test\\java\\InterviewPractise\\Document.text");

        Scanner sc = new Scanner(fis);
       while( sc.hasNext())
       {
           System.out.println(sc.next());
       }
    }
}
