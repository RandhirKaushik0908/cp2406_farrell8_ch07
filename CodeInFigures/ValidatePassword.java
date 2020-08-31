import java.util.*;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        String aString;
        char ch;
        int stringLength, upperCount = 0, lowerCount = 0, digitCount = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your new password >> ");
        aString = in.nextLine();
        stringLength = aString.length();
        for(int i = 0; i < stringLength; i++)
        {
            ch = aString.charAt(i);
            if(Character.isUpperCase(ch))
                upperCount++;
            else
            if(Character.isLowerCase(ch))
                lowerCount++;
            else
            if(Character.isDigit(ch))
                digitCount++;
        }
        if(upperCount >= 2 && lowerCount >= 2 && digitCount >= 2)
            System.out.println("Valid password");
        else
        {
            System.out.println("The password you entered did not have enough:");
            if(upperCount < 2)
                System.out.println("uppercase letters");
            if(lowerCount < 2)
                System.out.println("lowercase letters");
            if(digitCount < 2)
                System.out.println("digits");
        }
    }
}