// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// Course : Java Programming
// Assignment : Lab 5

import java.util.Scanner;
import java.util.Random;

public class Lab5
{

    public static void main(String[] args)
    {
        
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        int num;
        
        System.out.print("Please enter a non negative number: ");
        num = kb.nextInt();
        int[] array = new int[num + 10];
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = r.nextInt(50);
        }
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        array[array.length - 1] = array[7] - (2 * array[4]);
        
        System.out.println("Total: " + getTotal(array));
        System.out.println("Average: " + getAverage(array));
        System.out.println("Highest: " + getHighest(array));
        System.out.println("Lowest: " + getLowest(array));
        
    }
    
    public static void printArray(int[] a)
    {
        
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
    }
    
    public static int getTotal(int[] a)
    {
        
        int total = 0;
        for (int x : a)
        {
            total += x;
        }
        
        return total;
        
    }
    
    public static int getAverage(int[] a)
    {
        
        int average;
        
        average = getTotal(a)/a.length;
        
        return average;
        
    }
    
    public static int getHighest(int[] a)
    {
        
        int highest = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (highest < a[i])
                highest = a[i];
        }
        
        return highest;
        
    }
    
    public static int getLowest(int[] a)
    {
        
        int lowest = 50;
        for (int i = 0; i < a.length; i++)
        {
            if (lowest > a[i])
                lowest = a[i];
        }
        
        return lowest;
        
    }
    
}
