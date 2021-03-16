// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// Course : Java Programming
// Assignment : Assignment 1

import java.util.Scanner;

public class BCS345hw1
{

    public static void main(String[] args)
    {
        
    // Task 1
      // Step 1
        System.out.println("Plan A: $39.99 per month. 450 free minutes.\n\tAdditional usage costs $0.45 per minute.");
        System.out.println("Plan B: $59.99 per month. 900 free minutes. \n\tAdditional usage costs $0.40 per minute.");
        System.out.println("Plan C: $69.99 per month. Unlimited minutes.\n");
        
      // Step 2
        String fullName;
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your Full Name: ");
        fullName = kb.nextLine();
        
      // Step3
        char choice;
        System.out.print("\nWhich plan have you purchased (A, B, or C): ");
        choice = kb.next().charAt(0);
        while (choice != 'a' && choice != 'A' && choice != 'b' && choice != 'B' && choice != 'c' && choice != 'C')
        {
            System.out.print("The plan you entered is invalid. Which plan have you purchased (A, B, or C): ");
            choice = kb.next().charAt(0);
            //if(choice != 'a' || choice != 'A' || choice != 'b' || choice != 'B' || choice != 'c' || choice != 'C')
        }
        switch (choice)
        {
            case 'a':
                System.out.println("You've entered Plan A");
                break;
            case 'A':
                System.out.println("You've entered Plan A");
                break;
            case 'b':
                System.out.println("You've entered Plan B");
                break;
            case 'B':
                System.out.println("You've entered Plan B");
                break;
            case 'c':
                System.out.println("You've entered Plan C");
                break;
            case 'C':
                System.out.println("You've entered Plan C");
                break;
        }
        
      // Step 4
        double minutes = 0.0;
        System.out.print("\nHow many minutes were used last month: ");
        minutes = kb.nextDouble();
        while (minutes < 0.0)
        {
            System.out.print("The number you've entered is negative. How many minutes were used last month: ");
            minutes = kb.nextDouble();
        }
        
      // Step 5
        double chargeA, chargeB, chargeC = 69.99;
        
        if (minutes > 450)
            chargeA = ((minutes - 450) * 0.45) + 39.99;
        else
            chargeA = 0.0;
        
        if (minutes > 900)
            chargeB = ((minutes - 900) * 0.4) + 59.99;
        else
            chargeB = 59.99;
        
      // Step 6
        System.out.println("\nMonthly Statement for " + fullName);
        if (choice == 'a' || choice == 'A')
        {
            System.out.println("Plan A - Minutes Used: " + minutes);
            System.out.printf("Amount Due: $%.2f", chargeA);
        }
        else if (choice == 'b' || choice == 'B')
        {
            System.out.println("Plan B - Minutes Used: " + minutes);
            System.out.printf("Amount Due: $%.2f", chargeB);
        }
        else
        {
            System.out.println("Plan C - Minutes Used: " + minutes);
            System.out.println("Amount Due: $0.00");
        }
        
      // Step 7
        if ((choice == 'a' || choice == 'A') && (chargeA > chargeB))
        {
            System.out.printf("\nBy switching to Plan B you would save $%.2f", (chargeA - chargeB));
            System.out.printf("\nBy switching to Plan C you would save $%.2f", (chargeA - chargeC));
        }
        else if ((choice == 'b' || choice == 'B') && (chargeB > chargeC))
            System.out.printf("\nBy switching to Plan C you would save $%.2f", (chargeB - chargeC));
        else
            System.out.println("You chose best");
        
    // Task 2
        System.out.print("\n\n");
        System.out.print("Task 2:");
        char counter = ' ';
        for (int i = 0; i < 96; i++)
        {
            if (i % 16 == 0)
                System.out.print("\n");
            
            System.out.print(counter + " ");
            counter++;
        }
        System.out.print("\n\n");
    }
}