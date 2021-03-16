// I hereby certify that this is my original work.
// Name : Nicholas Crayne
// RAM ID: R01876070
// Course : Java Programming
// Assignment : Extra Credit

public class BCS345hwec
{
    
    public static void main(String[] args)
    {
        
        Verifier check = new Verifier();
        
        // Task 1
        String test1 = "Abcd1234"; // Valid Password
        if (check.isValid(test1))
            System.out.println("This password is valid.");
        else
            System.out.println("This password is invalid.");
        
        String test2 = "abcd123";  // Invalid Password - Too Short
        if (check.isValid(test2))
            System.out.println("This password is valid.");
        else
            System.out.println("This password is invalid.");
        
        String test3 = "abcd1234"; // Invalid Password - No Upper Case Letters
        if (check.isValid(test3))
            System.out.println("This password is valid.");
        else
            System.out.println("This password is invalid.");
        
        String test4 = "ABCD1234"; // Invalid Password - No Lower Case Letters
        if (check.isValid(test4))
            System.out.println("This password is valid.");
        else
            System.out.println("This password is invalid.");
        
        String test5 = "abcdefgh"; // Invalid Password - No Digits
        if (check.isValid(test5))
            System.out.println("This password is valid.");
        else
            System.out.println("This password is invalid.");
        
        // Task 2 - Using the test1 String
        System.out.println("\nThe number of letters and digits in the string is " + check.countOfLetterAndDigit(test1));
        
        // Task 3 - Using the test1 String
        System.out.println("\nNormal String: " + test1);
        System.out.println("Reversed String: " + check.reverseString(test1));
        
        // Task 4
        String wordCountTest = "This is a test of the wordCount method";
        System.out.println("\nString being tested: " + wordCountTest);
        System.out.println("Number of words: " + check.wordCounter(wordCountTest));
        
    }
    
}
