// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 4

public class Person
{
    
    private String firstName;
    private String lastName;
    
    /**
     * Default Constructor
     */
    public Person()
    {
        firstName = "No Name";
        lastName = "No Name";
    }
    
    /**
     * Overloaded Constructor
     * @param f contains the First Name
     * @param l contains the Last Name
     */
    public Person(String f, String l)
    {
        firstName = f;
        lastName = l;
    }
    
    /**
     * Copy Constructor
     * @param other contains the Person object being copied
     */
    public Person(Person other)
    {
        firstName = other.getFirstName();
        lastName = other.getLastName();
    }
    
    /**
     * Returns the value of firstName
     * @return the value of firstName
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Returns the value of lastName
     * @return the value of lastName
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Sets the value of firstName equal to the parameter f
     * @param f contains the First Name
     */
    public void setFirstName(String f)
    {
        firstName = f;
    }
    
    /**
     * Sets the value of lastName equal to the parameter l
     * @param l contains the Last Name
     */
    public void setLastName(String l)
    {
        lastName = l;
    }
    
    /**
     * Returns a String containing all of the relevant data about the Person object
     * @return A String containing all of the relevant data about the Person object
     */
    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
    
    /**
     * Returns true if all of this Person objects members are equal to those of the other one. False otherwise.
     * @param other The other Person object being compared to this one
     * @return A Boolean Value depending on whether or not this Person object is equal to the other Person object.
     */
    public Boolean equals(Person other)
    {
        return (this.getFirstName().equals(other.getFirstName())&&
                this.getLastName().equals(other.getLastName()));
    }
    
}
