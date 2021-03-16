// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 3

import java.util.Scanner;
import java.io.*;

public class BCS345hw3
{
    
    public static void main(String[] args) throws IOException
    {
        
        
        
        Student[] classroom = new Student[25];
        for (int i = 0; i < classroom.length; i++)
        {
            classroom[i] = new Student();
        }
        
        File file = new File("hw3data.txt");
        Scanner inputFile = new Scanner(file);
        
        for (int i = 0; i < classroom.length; i++)
        {
            classroom[i].setID(inputFile.nextInt());
            classroom[i].setFName(inputFile.next());
            classroom[i].setLName(inputFile.next());
            int[] x = new int[classroom[i].scores.length];
            for (int j = 0; j < x.length; j++)
            {
                x[j] = inputFile.nextInt();
            }
            classroom[i].setScores(x);
        }
        inputFile.close();
        
        System.out.println(" ID\tFirst Name\tLastName\t\tScores\t\t  Average   Grade");
        for (int i = 0; i < classroom.length; i++)
        {
            System.out.println(classroom[i].toString());
        }
        
    }
    
}
