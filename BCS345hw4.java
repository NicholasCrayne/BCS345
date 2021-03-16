// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 4

import java.io.*;
import java.util.*;

public class BCS345hw4
{
    
    public static void main(String[] args) throws IOException
    {
    // Task 1
        Employee Bob = new Employee();
        Employee Robin = new Employee("Robin", "Brown", 01010, 1995, 4, 26);
        Employee Robin2 = new Employee(Robin);
        
        System.out.println(Bob); // Before reassignment
        Bob.setFirstName("Robert");
        Bob.setLastName("Heinz");
        Bob.setID(10101);
        Date x = new Date(1982, 6, 12);
        Bob.setHireDate(x);
        System.out.println(Bob); // After reassignment
        
        System.out.println("\nTesting the equals method with Bob and Robin...");
        if (Robin.equals(Bob))
        {
            System.out.println("They are the same!");
        }
        else
        {
            System.out.println("They are not the same!");
        }
        System.out.println("\nTesting the equals method with Robin and Robin2...");
        if (Robin.equals(Robin2))
        {
            System.out.println("They are the same!");
        }
        else
        {
            System.out.println("They are not the same!");
        }
        System.out.println();
        
    // Task 2, 3, 4, and 5
        try // Block which will run as long as the file is found
        {
            File file = new File("hw4data.txt");
            Scanner inputFile = new Scanner(file);
            Employee[] empList = new Employee[50];
            int id = 0, year = 1, month = 1, day = 1, count = 0;
            String first = "", last = "";
            
            while (inputFile.hasNext())
            {
                try // Block which will run as long as there is no invalid data matching
                {
                    id = inputFile.nextInt();
                    first = inputFile.next();
                    last = inputFile.next();
                    year = inputFile.nextInt();
                    month = inputFile.nextInt();
                    day = inputFile.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid Data Entry!");
                }
                finally
                {
                    empList[count] = new Employee(first, last, id, year, month, day);
                    count++;
                }
            }
            
            for (int i = 0; i < count; i++)
            {
                System.out.println(empList[i]);
            }
            processHireDate(empList, count);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found!");
        }
        
    }
    
    // Task 6
    /**
     * Checks an array of Employee objects and prints out
     * the Earliest and Latest hire dates from amongst them.
     * @param array contains an array of Employee objects
     * @param num contains the number of Employee objects
     */
    public static void processHireDate(Employee[] array, int num)
    {
        
        int earliest = 0, latest = 0;
        Date min = new Date(2019,12,31);
        Date max = new Date(1990,1,1);
        
        // Loops to find the earliest hire date
        for (int i = 0; i < num; i++)
        {
            // If the year is less, set, then proceed to check the next array element
            if (array[i].getHireDate().getYear() < min.getYear())
            {
                min.setDate(array[i].getHireDate().getYear(),
                            array[i].getHireDate().getMonth(),
                            array[i].getHireDate().getDay());
                earliest = i;
            }
            // If the years are equal, dive deeper
            else if (array[i].getHireDate().getYear() == min.getYear())
            {
                // If the month is less, set, then proceed to check the next array element
                if (array[i].getHireDate().getMonth() < min.getMonth())
                {
                    min.setDate(array[i].getHireDate().getYear(),
                                array[i].getHireDate().getMonth(),
                                array[i].getHireDate().getDay());
                    earliest = i;
                }
                // If the months are equal, dive deeper
                else if (array[i].getHireDate().getMonth() == min.getMonth())
                {
                    // If the day is less, set, then proceed to check the next array element
                    if (array[i].getHireDate().getDay() < min.getDay())
                    {
                        min.setDate(array[i].getHireDate().getYear(),
                                    array[i].getHireDate().getMonth(),
                                    array[i].getHireDate().getDay());
                        earliest = i;
                    }
                }
            }
        }
        
        //Loops to find the latest hire date
        for (int i = 0; i < num; i++)
        {
            if (array[i].getHireDate().getYear() > max.getYear())
            {
                max.setDate(array[i].getHireDate().getYear(),
                            array[i].getHireDate().getMonth(),
                            array[i].getHireDate().getDay());
                latest = i;
            }
            else if (array[i].getHireDate().getYear() == max.getYear())
            {
                if (array[i].getHireDate().getMonth() > max.getMonth())
                {
                    max.setDate(array[i].getHireDate().getYear(),
                                array[i].getHireDate().getMonth(),
                                array[i].getHireDate().getDay());
                    latest = i;
                }
                else if (array[i].getHireDate().getMonth() == max.getMonth())
                {
                    if (array[i].getHireDate().getDay() > max.getDay())
                    {
                        max.setDate(array[i].getHireDate().getYear(),
                                    array[i].getHireDate().getMonth(),
                                    array[i].getHireDate().getDay());
                        latest = i;
                    }
                }
            }
        }
        
        System.out.println("\nEarliest Year of Hire: " + array[earliest].getHireDate().toString() + 
                           "\nLatest Year of Hire: " + array[latest].getHireDate().toString());
        
    }
    
}
