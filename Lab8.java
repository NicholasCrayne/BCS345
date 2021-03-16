/**
 * I hereby certify that this is my original work.
 * @author Nicholas Crayne
 * 
 * Course: BCS345 - Java Programming
 * Assignment: Lab 8
 */
public class Lab8
{
    
    public static void main(String[] args)
    {
        
        // Task 4
        Cube test1 = new Cube();
        System.out.println(test1.toString());
        test1.setLength(10);
        test1.setWidth(10);
        test1.setHeight(10);
        System.out.println(test1.toString()
                + String.format("\tVolume = %.2f", test1.getVolume()));
        
        Cube test2 = new Cube(20, 20, 20);
        System.out.println("Comparing Cubes 1 and 2...");
        System.out.println("Are the two equal? (True or False): "
                + String.valueOf(test2.equals(test1)));
        
        Cube test3 = new Cube(test2);
        System.out.println("Comparing Cubes 2 and 3...");
        System.out.println("Are the two equal? (True or False): "
                + String.valueOf(test2.equals(test3)));
        
        // Task 5
        Rectangle[] array = new Rectangle[4];
        array[0] = new Rectangle(10,20);
        array[1] = new Rectangle(-4,-5);
        array[2] = new Cube(2,3,4);
        array[3] = new Cube(11,12,-13);
        for (int i = 0; i < 4; i++)
        {
            System.out.println(array[i].toString());
        }
        
        // Task 6
        System.out.println("The number of Rectangles created is "
                + test1.getCount());
        
    }
    
}
