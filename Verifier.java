// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Extra Credit

public class Verifier
{
    
    private final int MIN_LENGTH = 8;
    
    public Boolean hasUpperCase(String s)
    {
        Boolean check = false;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isUpperCase(array[i]))
                check = true;
        }
        return check;
    }
    
    public Boolean hasLowerCase(String s)
    {
        Boolean check = false;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLowerCase(array[i]))
                check = true;
        }
        return check;
    }
    
    public Boolean hasDigit(String s)
    {
        Boolean check = false;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isDigit(array[i]))
                check = true;
        }
        return check;
    }
    
    public Boolean isValid(String s)
    {
        return (this.hasUpperCase(s) &&
                this.hasLowerCase(s) &&
                this.hasDigit(s) &&
                (s.length() >= MIN_LENGTH));
    }
    
    public int countOfLetterAndDigit(String s)
    {
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(array[i]))
                count++;
            if (Character.isDigit(array[i]))
                count++;
        }
        return count;
    }
    
    public String reverseString(String s)
    {
        String reverse = "";
        char[] array = s.toCharArray();
        for (int i = array.length-1; i >= 0; i--)
        {
            reverse += array[i];
        }
        return reverse;
    }
    
    public int wordCounter(String s)
    {
        String[] tokens = s.split(" ");
        return tokens.length;
    }
    
}
