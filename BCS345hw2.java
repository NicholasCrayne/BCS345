// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 2

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class BCS345hw2
{
    
    public static void main(String[] args) throws IOException
    {
        
        System.out.println("TASK 1");
        Random die = new Random();
        Scanner kb = new Scanner(System.in);
        int x, count;
        int[] rollTracker = new int[6];
        double[] rollFrequency = new double[6];
        
        System.out.print("Please enter the number of time you'd like to roll the die: ");
        count = kb.nextInt();
        
        for (int i = 0; i < count; i++)
        {
            x = die.nextInt(6) + 1;
            rollTracker[x-1]++;
        }
        
        for (int i = 0; i < 6; i++)
        {
            rollFrequency[i] = (double)rollTracker[i] / count;
        }
        System.out.println(rollFrequency[0]);
        
        System.out.println("Face Value    Number of Occurances    Frequency");
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("%5d%21d%20.5f\n", (i+1), rollTracker[i], rollFrequency[i]);
        }
        
        System.out.println("TASK 2");
        double[][] salesInfo = new double[5][4];
        File file = new File("hw2data.txt");
        Scanner inputFile = new Scanner(file);
        
        System.out.println("Data read from the file:");
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                salesInfo[i][j] = inputFile.nextDouble();
                System.out.printf("%10.2f ", salesInfo[i][j]);
            }
            System.out.println();
        }
        inputFile.close();
        
        double[] totalPerson = new double[4];
        double[] totalProduct = new double[5];
        double[] highestPerson = new double[4];
        double[] highestProduct = new double[5];
        
        for (int i = 0; i < salesInfo.length; i++)
        {
            totalProduct[i] = getRowTotal(salesInfo, i);
        }
        
        for (int i = 0; i < salesInfo[i].length; i++)
        {
            totalPerson[i] = getColumnTotal(salesInfo, i);
        }
        
        for (int i = 0; i < salesInfo.length; i++)
        {
            highestProduct[i] = getHighestInRow(salesInfo, i);
        }
        
        for (int i = 0; i < salesInfo[i].length; i++)
        {
            highestPerson[i] = getHighestInColumn(salesInfo, i);
        }
        
        System.out.println("After processing data:");
        System.out.printf("\t\t     %-20s%-20s%-20s%-20s%-20s%-20s\n"
                ,"Salesperson 1"
                ,"Salesperson 2"
                ,"Salesperson 3"
                ,"Salesperson 4"
                ,"Totals by Product"
                ,"Highest By Product");
        for (int i = 0; i < salesInfo.length; i++)
        {
            System.out.printf("Product %d\t\t", (i+1));
            for (int j = 0; j < salesInfo[i].length; j++)
            {
                System.out.printf("%-20.2f", salesInfo[i][j]);
            }
            System.out.printf("%-20.2f", totalProduct[i]);
            System.out.printf("%-20.2f", highestProduct[i]);
            System.out.println();
        }
        System.out.print("Totals by Salesperson\t");
        for (int i = 0; i < totalPerson.length; i++)
        {
            System.out.printf("%-20.2f", totalPerson[i]);
        }
        System.out.print("\nHighest by Salesperson\t");
        for (int i = 0; i < highestPerson.length; i++)
        {
            System.out.printf("%-20.2f", highestPerson[i]);
        }
        System.out.printf("The total sales for the month:\t$%.2f\n", getTotal(salesInfo));
        
    }
    
    public static void printArray(double[][] array)
    {
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.printf("%10.2f ", array[i][j]);
            }
            System.out.println();
        }
        
    }
    
    public static double getTotal(double[][] array)
    {
        
        double total = 0.0;
        
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
               total += array[i][j];
            }
            System.out.println();
        }
        
        return total;
        
    }
    
    public static double getRowTotal(double[][] array, int row)
    {
        
        double total = 0.0;
        
        for (int i = 0; i < array[i].length; i++)
        {
            total += array[row][i];
        }
        
        return total;
        
    }
    
    public static double getColumnTotal(double[][] array, int col)
    {
        
        double total = 0.0;
        
        for (int i = 0; i < array.length; i++)
        {
            total += array[i][col];
        }
        
        return total;
        
    }
    
    public static double getHighestInRow(double[][] array, int row)
    {
        
        double highest = 0.0;
        
        for (int i = 0; i < array[i].length; i++)
        {
            if (array[row][i] > highest)
            {
                highest = array[row][i];
            }
        }
        
        return highest;
        
    }
    
    public static double getHighestInColumn(double[][] array, int col)
    {
        
        double highest = 0.0;
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i][col] > highest)
            {
                highest = array[i][col];
            }
        }
        
        return highest;
        
    }
    
}
