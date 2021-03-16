// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// Course : Java Programming
// Assignment : Lab 3

import java.io.*;
import java.util.Scanner;

public class Lab3
{
    
    public static void main(String[] args) throws IOException
    {
        
    // Step 1
        int lower, upper;
        int multsOfThree = 0;
        Scanner kb = new Scanner (System.in);
        PrintWriter outputFile = new PrintWriter("lab3data.txt");
        
        System.out.print("Please enter a lower bound: ");
        lower = kb.nextInt();
        
        System.out.print("Please enter an upper bound: ");
        upper = kb.nextInt();
        
    // Step 2
        for (int i = lower; i < upper; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + " ");
                outputFile.println(i);
                multsOfThree++;
            }
        }
        outputFile.close();
        
    // Step 3
        System.out.println("\nBetween the lower and upper bounds, there were "
                + multsOfThree + " multiples of three.");
        
    // Step 4
        int x, sumOfThrees = 0;
        File input = new File ("lab3data.txt");
        Scanner inputFile = new Scanner(input);
        while (inputFile.hasNext())
        {
            x = inputFile.nextInt();
            System.out.print(x + " ");
            sumOfThrees = sumOfThrees + x;
        }
        System.out.println("\n Sum: " + sumOfThrees);
        inputFile.close();
        
    // Step 5 : Extra Credit
    
    // Triangle 1
        System.out.print('\n');
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.print('\n');
        }
        
    // Triangle 2
        System.out.print('\n');
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 5; j >= 0; j--)
            {
                if (j > i)
                    System.out.print(' ');
                if (j <= i)
                    System.out.print('*');
            }
            System.out.print('\n');
        }
        
    // Triangle 3
        System.out.print('\n');
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 5; j >= 0; j--)
            {
                if (j > i)
                    System.out.print(' ');
                if (j <= i)
                    System.out.print('*');
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print('*');
            }
            System.out.print('\n');
        }
        
    }
    
}
