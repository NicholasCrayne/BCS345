// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 4

public class Employee extends Person
{
    
    private Integer ID;
    private Date hireDate;
    
    /**
     * Default Constructor
     */
    public Employee()
    {
        super();
        ID = 0;
        hireDate = new Date();
    }
    
    /**
     * Overloaded Constructor
     * @param f contains the First Name
     * @param l contains the Last Name
     * @param id contains the Employee ID
     * @param y contains the Year of Hire
     * @param m contains the Month of Hire
     * @param d contains the Day of Hire
     */
    public Employee(String f, String l, int id, int y, int m, int d)
    {
        super(f,l);
        ID = id;
        hireDate = new Date(y,m,d);
    }
    
    /**
     * Copy Constructor
     * @param other contains the Employee object being copied
     */
    public Employee(Employee other)
    {
        super(other.getFirstName(), other.getLastName());
        ID = other.getID();
        hireDate = new Date(other.hireDate.getYear(), 
                            other.hireDate.getMonth(), 
                            other.hireDate.getDay());
    }
    
    /**
     * Returns the value of ID
     * @return The Value of ID
     */
    public Integer getID()
    {
        return ID;
    }
    
    /**
     * Returns the reference to the Date object hireDate
     * @return The reference to hireDate
     */
    public Date getHireDate()
    {
        return hireDate;
    }
    
    /**
     * Sets the value of ID equal the the parameter id
     * @param id The Employee ID
     */
    public void setID(int id)
    {
        ID = id;
    }
    
    /**
     * Sets the hireDate object's member variables to be set according to the values of the Date object parameter
     * @param hd The Date object parameter that contains the year, month, and day.
     */
    public void setHireDate(Date hd)
    {
        hireDate.setDate(hd.getYear(), hd.getMonth(), hd.getDay());
    }
    
    /**
     * Returns a String containing all of the relevant data about the Employee object
     * @return A String containing all of the relevant data about the Employee object
     */
    @Override
    public String toString()
    {
        return String.format("%s %d %s", super.toString(), this.getID(), this.getHireDate().toString());
    }
    
    /**
     * Returns true if all of this Employee objects members are equal to those of the other one. False otherwise.
     * @param other The other Employee object being compared to this one
     * @return A Boolean Value depending on whether or not this Employee object is equal to the other Employee object.
     */
    public Boolean equals(Employee other)
    {
        return (this.getFirstName().equals(other.getFirstName()) && 
                this.getLastName().equals(other.getLastName()) &&
                this.getID() == other.getID() &&
                this.hireDate.getYear() == other.hireDate.getYear() && 
                this.hireDate.getMonth() == other.hireDate.getMonth() && 
                this.hireDate.getDay() == other.hireDate.getDay());
    }
    
}
