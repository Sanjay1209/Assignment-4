// 7. WAP to find if String contains all unique characters.
import java.util.*;
 
class Q7 {
    boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same characters, then return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        // If no duplicate characters encountered,then return true
        return true;
    }
 
    public static void main(String args[])
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a string :");
        Q7 obj = new Q7();
        String input = scanner.nextLine();
 
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }
}