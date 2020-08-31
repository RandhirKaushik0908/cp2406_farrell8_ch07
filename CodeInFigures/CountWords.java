import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        String str;
        Scanner in = new Scanner(System.in);
        char ch;
        int x, count = 0, length;
        boolean previousCharWasPunc = false;
        System.out.print("Please enter a sentence >> ");
        str = in.nextLine();
        length = str.length();
        for(x = 0; x < length; x++)
        {
            ch = str.charAt(x);
            if(ch == ' ' || ch == '.' || ch == ';' || ch == ',' || ch == '!' || ch == '-' || ch == '?' )
            {
                ++count;
                if(previousCharWasPunc)
                    --count;
                previousCharWasPunc = true;
            }
            else
                previousCharWasPunc = false;
        }
        if(!previousCharWasPunc)
            ++count;
        System.out.println("There are " + count + " words in the string");
    }
}