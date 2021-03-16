/**
 * I hereby certify that this is my original work.
 * @author Nicholas Crayne
 * 
 * Course: BCS345 - Java Programming
 * Assignment: Lab 7
 */

import java.util.Scanner;

public class Lab7
{

    public static void main(String[] args)
    {
        
        Scanner kb = new Scanner(System.in);
        Television livingroomTV = new Television("Sony", 50);
         
        livingroomTV.power(true);
        System.out.print("Please enter a channel: ");
        livingroomTV.setChannel(kb.nextInt());
        livingroomTV.decreaseVolume();
        livingroomTV.decreaseVolume();
        System.out.printf("\nChannel: %d\nVolume: %d\n\n",
                livingroomTV.getChannel(), livingroomTV.getVolume());
        System.out.println(livingroomTV.toString());
         
        Television diningroomTV = new Television("Toshiba", 40);
        System.out.println(diningroomTV.toString());
        
        if(livingroomTV.equals(diningroomTV) == true)
            System.out.println("The two are the same!\n");
        else
            System.out.println("the two are different!\n");
        
        System.out.println("The number of Television objects created is " + livingroomTV.getCounts() + ".\n");
        
        Television[] arrayTV = new Television[4];
        arrayTV[0] = new Television("LG", 40);
        arrayTV[1] = new Television("Sharp", 36);
        arrayTV[2] = new Television("Sony", 70);
        arrayTV[3] = new Television("Samsung", 65);
        
        for (int i = 0; i < 4; i++)
        {
            System.out.println(arrayTV[i].toString());
        }
        
        System.out.println("The number of Television objects created is " + livingroomTV.getCounts() + ".\n");
        
        for (int i = 0; i < 4; i++)
        {
            livingroomTV.channelAddTen();
        }
        
        System.out.println(livingroomTV.toString());
        
    }
    
}
