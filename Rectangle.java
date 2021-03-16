/**
   Rectangle class
*/

public class Rectangle
{
    private double length;
    private double width;
    private static int count = 0;

    /**
      * Default Constructor constructs a Rectangle object 
      * and initializes the length and width fields to 0.
    */

    public Rectangle()
   {
      length = 0;
      width = 0;
      count++;
   }
   
    /**
       * Constructor constructs a Rectangle object and  
       * initializes the length and width fields per the parameters.
       @param l The length of the rectangle.
       @param w The width of the rectangle.
    */

    public Rectangle(double l, double w)
    {
        this.setLength(l);
        this.setWidth(w);
        count++;
    }
    
    /**
     * Copy Constructor constructs a Rectangle object given a Rectangle object
     * @param other A Rectangle object
    */
    
    public Rectangle(Rectangle other){
        length = other.length;
        width = other.width;
        count++;
    }    

    /**
       Store a value in the length field.
       @param l The value to store in length.
    */
    
    public void setLength(double l)
    {
        if (l < 0)
            length = 0;
        else
            length = l;
    }

    /**
       Store a value in the width field.
       @param w The value to store in width.
    */
    
    public void setWidth(double w)
    {
        if (w < 0)
            width = 0;
        else
            width = w;
    }

    /**
       Return a Rectangle object's length.
       @return The value in the length field.
    */

    public double getLength()
    {
        return length;
    }

    /**
       Return a Rectangle object's width.
       @return The value in the width field.
    */
   
    public double getWidth()
    {
        return width;
    }

    /**
       Return a Rectangle object's area.
       @return The area of a Rectangle object.
    */

    public double getArea()
    {
        return length * width;
    }

    /**
       toString method
       @return A string indicating the object's length and width.
    */  
    
    @Override
    public String toString(){
    //    String str = "Length = " + length + "\tWidth = " + width;
        String str = String.format("Length = %.2f\tWidth = %.2f", length, width);
        return str;
    }
    
    /**
     * Compare two Rectangle objects
     * @param other The Rectangle object
     * @return true if two objects have the same values of length and width
     */
    public boolean equals(Rectangle other){
        return length == other.length && width == other.width;
    }

    /**
     * Return the number of objects created
     * @return the number of objects created
     */
    public static int getCount() {
        return count;
    }
}