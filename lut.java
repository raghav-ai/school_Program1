/*
 * Program to seperate the lowercase and uppercase letters from a string and printing the letters in two different files(lower.txt and Upper.txt)
 * Using file writer
*/
import java.util.*;
import java.io.*;
class lut
{
    public static void main(String []args)throws IOException
    {
        FileWriter f = new FileWriter("lower.txt");
        FileWriter g= new FileWriter("Upper.txt");
        PrintWriter p = new PrintWriter(f);
        PrintWriter o = new PrintWriter(g);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                p.println(ch);
            }
            if(Character.isUpperCase(ch))
            {
                o.println(ch);
            }
        }
        p.close();
        o.close();
        f.close();
        g.close();
    }
}
/* Variable data Table(VDT)
 * Variable Name    Datatype    Use
 *        s         String      stores the complete line.
 *        i         int         loop variable
 *        ch        char        stores the character of the string at a specific index number
*/
