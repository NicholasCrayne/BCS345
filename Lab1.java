/*
BCS345 Lab1
CRN 21177, 25160 
Spring 2019
*/

// 1. Add an import statement here to make the Scanner class available to your program.
import java.util.Scanner;
// 2. Add an import statement here to make the JOptionPane class available to your program.
import javax.swing.JOptionPane;

public class Lab1 {

    public static void main(String[] args) {
        // 3. Create a Scanner object and connect it to the System.in object.
        Scanner keyboard = new Scanner(System.in);
        
        // 4. Declare three int variables a, b, c.
       int a, b, c;
        
        // 5. Declare one double variable named ave. Initialize ave to 0.
       double ave = 0;
       
        // 6. Prompt the user to enter three integers and store them into a, b, c, respectively.       
       System.out.println("Please enter values for variables a, b, and c:");
       a = keyboard.nextInt();
       b = keyboard.nextInt();
       c = keyboard.nextInt();
        
        // 7. Calculate the average of a, b, and c, cast it into double to keep computation precision, and store it into the variable ave.
        ave = (double)(a + b + c) / 3;
        
        // 8. Output the value of a, b, c and their average on the screen.
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + c);
        System.out.println("The average of all three is " + ave);
        
        // 9. Declare three string variables: firstName, lastName, fullName.
        String firstName, lastName, fullName;
        
        // 10. Prompt the user to enter his or her first name by displaying an input dialog box and storing the input in variable firstName.  
        firstName = JOptionPane.showInputDialog("Please enter your First Name: ");

        // 11. Prompt the user to enter his or her last name by displaying an input dialog and storing the input in variable lastName.
        lastName = JOptionPane.showInputDialog("Please enter your Last Name: ");
        
        // 12. Concatenate the firstName and lastName with a space between them and store the result in variable fullName.
        fullName = firstName + " " + lastName;
        
        // 13. Display the fullName using a message dialog box.
        System.out.println("Your full name is " + fullName);
        
        // 14. Use the charAt method to get the first character in firstName and store it in a variable called firstInitial. You need to declare s variable before using it. 
        char firstInitial = firstName.charAt(0);
                
        // 15. Print out the user's first initial on the console window.
        System.out.println("Your first initial is " + firstInitial);
        
        // 16. Use the toUpperCase method to change the fullName to uppercase and store it back into the fullName variable.
        fullName = fullName.toUpperCase();
        
        // 17. Print out the value of fullName and how many characters (including the space) are in the fullName (use the length method).
        System.out.println("Your full name in capital letters is " + fullName + " and it has " + fullName.length() + " letters and spaces");
        
        // 18. Print out the following sentence on the screen:
            // John Johnson said, "First, solve the problem. Then, write the code."
        System.out.println("First, solve the problem. Then, write the code.");
        
        // 19. Prompt the user for an integer using an input dialog and display it in a message dislog box
        String x;
        int s;
        x = JOptionPane.showInputDialog("Please enter an interger: ");
        s = Integer.parseInt(x);
        
        // 20. Exit JOptionPane thread
        System.exit(0);
        
    }
    
}