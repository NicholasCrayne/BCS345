// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 4

public class Date
{
    
    private int year;
    private int month;
    private int day;
    
    /**
     * Default Constructor
     */
    public Date()
    {
        year = 2001;
        month = 1;
        day = 1;
    }
    
    /**
     * Overloaded Constructor
     * @param y contains the Year of Hire
     * @param m contains the Month of Hire
     * @param d contains the Day of Hire
     */
    public Date(int y, int m, int d)
    {
        year = y;
        month = m;
        day = d;
    }
    
    /**
     * Copy Constructor
     * @param other contains the Date object being copied
     */
    public Date(Date other)
    {
        year = other.getYear();
        month = other.getMonth();
        day = other.getDay();
    }
    
    /**
     * Returns the value stored in year
     * @return the value stored in year
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * Returns the value stored in month
     * @return the value stored in month
     */
    public int getMonth()
    {
        return month;
    }
    
    /**
     * Returns the value stored in day
     * @return the value stored in day
     */
    public int getDay()
    {
        return day;
    }
    
    /**
     * Sets the values of year, month, and day equal to the parameters y, m, and d respectively
     * Data Validation checks to ensure that these parameters are within the legal limits before assignment.
     * @param y
     * @param m
     * @param d 
     */
    public void setDate(int y, int m, int d)
    {
        
        if (y >= 1900 && y <= 2019)
            year = y;
        else
            year = 2001;
        
        if (m >= 1 && m <= 12)
            month = m;
        else
            month = 1;
        
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
            if (d >= 1 && d <= 31)
                day = d;
            else
                day = 1;
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11)
        {
            if (d >= 1 && d <= 30)
                day = d;
            else
                day = 1;
        }
        else if (m == 2)
        {
            if (d >= 1 && d <= 28)
                day = d;
            else
                day = 1;
        }
        else
            day = 1;
        
    }
    
    /**
     * Returns a String containing all of the relevant data about the Date object
     * @return A String containing all of the relevant data about the Date object
     */
    public String toString()
    {
        return String.format("%d-%d-%d", year, month, day);
    }
    
    /**
     * Returns true if all of this Date objects members are equal to those of the other one. False otherwise.
     * @param other The other Date object being compared to this one
     * @return A Boolean Value depending on whether or not this Date object is equal to the other Date object.
     */
    public Boolean equals(Date other)
    {
        return (this.getYear() == other.getYear() && 
                this.getMonth() == other.getMonth() && 
                this.getDay() == other.getDay());
    }
    
}