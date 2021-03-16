// I hereby certify that this is my original work.
// Author: Nicholas Crayne
// Course: BCS345 - Java Programming
// Assignment: Lab 2

import java.util.Scanner;

public class Lab2
{
    
    public static void main(String[] args)
    {
        
        // Step 1
        char classStanding;
        double gpa, dues;
        
        // Step 2
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your GPA: ");
        gpa = kb.nextDouble();
        
        System.out.println("\nPlease enter your Class Standing: \n"
                + "'f' for Freshman\n"
                + "'m' for Sophmores\n"
                + "'j' for Juniors\n"
                + "'s' for Seniors");
        classStanding = kb.next().charAt(0);
        
        // Step 3
        if(classStanding == 'f')
           dues = 150;
        if(classStanding == 'm')
           dues = 120;
        if(classStanding == 'j')
           dues = 100;
        if(classStanding == 's')
           dues = 75;
        else
           dues = 0;
       
        // Step 4
        System.out.println("\nClass Standing: " + classStanding + "\nGPA: " + gpa + "\n");
        
        // Step 5
        switch(classStanding)
        {
            case 'f':
                dues = 150;
                break;
            case 'm':
                dues = (gpa >= 3.75) ? 75 : 120;
                break;
            case 'j':
                dues = (gpa >= 3.75) ? 50 : 100;
                break;
            case 's':
                dues = (gpa >= 3.75) ? 25 : 75;
                break;
            default:
                dues = 0;
                break;
        }
        
        // Step 6
        System.out.printf("Class Standing: %c \nGPA: $%.2f\n", classStanding, dues);
        
    }
    
}
