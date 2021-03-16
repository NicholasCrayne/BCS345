// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// Course : Java Programming
// Assignment : Lab 4

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Lab4
{

    public static void main(String[] args) throws IOException
    {
        
        Scanner kb = new Scanner(System.in);
        int count;
        String filename;
        
        System.out.print("Please enter the file name you wish the random numbers to be placed into: ");
        filename = kb.nextLine();
        System.out.print("Please enter the amount of random numbers you'd like to create: ");
        count = kb.nextInt();
        
        randFile(count, filename);
        
        char standing;
        
        System.out.print("\nPlease enter your Class Standing:\n"
                + "'f' for Freshman\n"
                + "'m' for Sophmores\n"
                + "'j' for Juniors\n"
                + "'s' for Seniors\n"
                + "Class Standing: ");
        standing = kb.next().charAt(0);
        double GPA = getGPA();
        
        double dues;
        dues = getDues(standing, GPA);
        
        System.out.printf("\nClass Standing: %c \nGPA: $%.2f\n", standing, dues);
        
    }
    
    public static double getGPA()
    {
        double GPA;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter a GPA: ");
        GPA = kb.nextDouble();
        
        while(GPA < 0.0 || GPA > 4.0)
        {
            System.out.print("You entered an invalid GPA. Please enter a GPA: ");
            GPA = kb.nextDouble();
        }
        
        return GPA;
    }
    
    public static void randFile(int count, String filename) throws IOException
    {
        Random randNums = new Random();
        PrintWriter outputFile = new PrintWriter(filename);
        int x;
        
        for (int i = 0; i < count; i++)
        {
            x = randNums.nextInt(1000);
            System.out.print(x + " ");
            outputFile.print(x + " ");
        }
        outputFile.close();
        
        System.out.println("\nThe numbers have been printed to " + filename);
    }
    
    public static double getDues(char standing, double GPA)
    {
        double dues;
        
        switch(standing)
        {
            case 'f':
                dues = 150;
                break;
            case 'm':
                dues = (GPA >= 3.75) ? 75 : 120;
                break;
            case 'j':
                dues = (GPA >= 3.75) ? 50 : 100;
                break;
            case 's':
                dues = (GPA >= 3.75) ? 25 : 75;
                break;
            default:
                dues = 0;
                break;
        }
        
        return dues;
    }
    
}
