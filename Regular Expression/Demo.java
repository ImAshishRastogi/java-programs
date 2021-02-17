

import java.util.regex.Pattern;
class Demo
{
    public static void main(String args[])
    {
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern "geeksforge*ks"
        System.out.println (Pattern.matches("geeksforge*ks","geeksforgeeks"));

        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println (Pattern.matches("g*geeks*","geeksfor"));
    }
}

//---------------------------------------------------------------------------------------------

/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo
{
    public static void main(String args[])
    {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("geeks");

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");

        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                               " to " + (m.end()-1));
    }
}
/*Output:

Pattern found from 0 to 4
Pattern found from 8 to 12*/

//---------------------------------------------------------------------------------------------


// A Simple Java program to demonstrate working of
// String matching in Java
/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo
{
    public static void main(String args[])
    {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("ge*");

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");

        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                               " to " + (m.end()-1));
    }
}
/*Output:

Pattern found from 0 to 2
Pattern found from 8 to 10
Pattern found from 16 to 16*/

//-----------------------------------------------------------------------------------------------

// A Simple Java program to demonstrate working of
// String matching in Java
/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo
{
    public static void main(String args[])
    {
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);

        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("GeeksforGeeks.org");

        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                               " to " + (m.end()-1));
    }
}
/*Output:

Pattern found from 0 to 2
Pattern found from 8 to 10
Pattern found from 16 to 16
*/

//-----------------------------------------------------------------------------------------------

// Java program to demonstrate working of splitting a text by a
// given pattern
/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo
{
    public static void main(String args[])
    {
        String text = "geeks1for2geeks3";

        // Specifies the string pattern which is to be searched
        String delimiter =  "\\d";
        Pattern pattern = Pattern.compile(delimiter,
                                        Pattern.CASE_INSENSITIVE);

        // Used to perform case insensitive search of the string
        String[] result = pattern.split(text);


        for (String temp: result)
            System.out.println(temp);
    }
}
/*Output:

geeks
for
geeks
*/

