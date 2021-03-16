// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Assignment 3

public class Student
{
    
    int ID;
    String firstName;
    String lastName;
    int[] scores = new int[5];
    
    public Student()
    {
        ID = 0;
        firstName = "No_Name";
        lastName = "No_Name";
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = 0;
        }
    }
    public Student(int id, String f, String l, int[] s)
    {
        ID = id;
        firstName = f;
        lastName = l;
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = s[i];
        }
    }
    public Student(Student other)
    {
        ID = other.ID;
        firstName = other.firstName;
        lastName = other.lastName;
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = other.scores[i];
        }
    }
    
    public void setID(int id)
    {
        ID = id;
    }
    public void setFName(String f)
    {
        firstName = f;
    }
    public void setLName(String l)
    {
        lastName = l;
    }
    public void setScores(int[] s)
    {
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = s[i];
        }
    }
    
    public int getID()
    {
        return ID;
    }
    public String getFName()
    {
        return firstName;
    }
    public String getLName()
    {
        return lastName;
    }
    public int[] getScores()
    {
        return scores;
    }
    public double getAverage()
    {
        int x = 0;
        for (int i = 0; i < scores.length; i++)
        {
            x += scores[i];
        }
        return (x / scores.length);
    }
    public char getGrade()
    {
        char grade = ' ';
        double average = this.getAverage();
        if (average >= 90 && average <= 100)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else if (average >= 0 && average < 60)
            grade = 'F';
        return grade;
    }
    
    public String toString()
    {
        String record = String.format
            ("%-10d %-12s %-15s", ID, firstName, lastName);
        for (int i = 0; i < scores.length; i++)
        {
            record += String.format("%-5d", scores[i]);
        }
        record += String.format("   %-10.2f %-5c", this.getAverage(), this.getGrade());
        return record;
    }
    
}
