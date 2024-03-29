/**
 * The Removing of character from the String.
 * @author: Vladimir Efros
 * This program gives a simple demonstration of the removing a character from the String.
 */

import java.util.Scanner;

public class StringRemoveCharacter
{
    public static void main(String[] args)
    {
        // Get the string from the user
        String str = getString("Enter the string: ");
        
        // Get the character from the user
        char ch = getString("Enter a character: ").charAt(0);
        
        // Remove the character
        String newStr = removeChar(str, ch);
        
        //Display reversed string
        displayStr(str, newStr);
    }
    
    /**
     * The displayStr method display both the original and the new string.
     * @param orig The original string before reverse.
     * @param rev  The string after the character was removed.
     */
    public static void displayStr(String orig, String rev)
    {
        System.out.println("The original String: " + orig);
        System.out.println("The new String: " + rev);
    }
    
    /**
     * The revStr method removes a character from the string.
     * @param s The string that is to be changed.
     * @param c The character that is to be deleted.
     * @return The new String.
     */
    public static String removeChar(String s, char c)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == c)
                count++;
        if(count != 0)
            return s.substring(0, s.indexOf(c)) + s.substring(s.indexOf(c) + 1);
        else
        {
             System.out.println("The character is not in the String!");
             return s;
        } 
    }
    
    /**
     * The getString method validates and returns the string entered by the user.
     * @return The string entered by the user.
     */
    public static String getString(String st)
    {
        String str = "";
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.print(st);
            str = keyboard.nextLine();
            if(str == null || str.length() < 1)
                System.out.println("Wrong! Try again!");
        }
        while(str == null || str.length() < 1);  
        return str;
    }
}
