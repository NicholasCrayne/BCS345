/**
 * I hereby certify that this is my original work.
 * @author Nicholas Crayne
 * 
 * Course: BCS345 - Java Programming
 * Assignment: Lab 7
 */

public class Television
{
    
    private final String manufacturer; //example: "Sony"
    private final int screenSize; //example: 50
    private boolean powerOn; //either true(on) or false(off)
    private int channel; //indicates to the user what channel the Television is currently on
    private int volume; //indicates to the user the Television's current volume
    
    private static int counts = 0; //keeps track of the number of Television objects created.
    
    
    /**
     * Default Constructor
     * @param m
     * @param s 
     */
    public Television(String m, int s)
    {
        manufacturer = m;
        screenSize = s;
        powerOn = false;
        channel = 2;
        volume = 10;
        
        counts++;
    }
    
    /**
     * Copy Constructor
     * @param other 
     */
    public Television(Television other)
    {
        manufacturer = other.getManufacturer();
        screenSize = other.getScreenSize();
        powerOn = other.powerOn;
        channel = other.getChannel();
        volume = other.getVolume();
        
        counts++;
    }
    
    /**
     * Return the manufacturer of the Television
     * @return The value pointed to by manufacturer
     */
    public String getManufacturer()
    {
        return manufacturer;
    }
    
    /**
     * Return the screen size of the Television
     * @return The value stored in screenSize
     */
    public int getScreenSize()
    {
        return screenSize;
    }
    
    /**
     * Return the Television object's current channel
     * @return The value stored in channel
     */
    public int getChannel()
    {
        return channel;
    }
    
    /**
     * Return the Television object's current volume
     * @return The value stored in volume
     */
    public int getVolume()
    {
        return volume;
    }
    
    /**
     * Return the number of Television objects created
     * @return The value stored in counts
     */
    public int getCounts()
    {
        return counts;
    }
    
    /**
     * Sets the powerOn variable to indicate whether the Television is On or Off
     * @param x 
     */
    public void power(boolean x)
    {
        powerOn = x;
    }
    
    /**
     * Sets the Television object's channel to the value of c
     * @param c 
     */
    public void setChannel(int c)
    {
        channel = c;
    }
    
    /**
     * Increases the volume of the Television by 1
     */
    public void increaseVolume()
    {
        volume += 1;
    }
    
    /**
     * Decreases the volume of the Television by 1
     */
    public void decreaseVolume()
    {
        volume -= 1;
    }
    
    /**
     * Increases the volume of the Television by 10
     */
    public void channelAddTen()
    {
        channel += 10;
    }
    
    /**
     * Return a report containing all relevant data about the Television
     * @return A formatted string of elements related to the Television
     */
    public String toString()
    {
        String p;
        if (powerOn == true)
            p = "On";
        else
            p = "Off";
        String s = String.format("Manufacturer: %s\n"
                + "Screen Size: %d\n"
                + "Power Status: %s\n"
                + "Channel: %d\n"
                + "Volume: %d\n",
                manufacturer, screenSize, p, channel, volume);
        
        return s;
    }
    
    /**
     * Determine the power status of the Television
     * @param other
     * @return <CODE>true</CODE> if the Television is On
     *         <CODE>false</CODE> if the Television is Off
     */
    public boolean equals(Television other)
    {
        return this.getManufacturer().equals(other.getManufacturer()) && this.getScreenSize() == other.getScreenSize();
    }
    
}