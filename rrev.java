// Program to reverse a string using recursion.i
import java.util.Scanner;
class rrev
{
    String r;
    rrev()
    {r="";
    }

    String rev(String k,int i)
    {
        if(i<k.length())
        {
            char ch = k.charAt(i);
            r=ch+r;
            return rev(k,++i);

        }
        else
            return r;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String k =sc.next();
        int i=0;
        rrev obj= new rrev();
        String l=obj.rev(k,i);
        System.out.println("Reversed word:");
        System.out.println(l);
    }
}
/* Variable Data Table(VDT)
 * Variable Name      Datatype    Use
 *        k           String      to store the input word
 *        r           String      to store the reserved word
 *        i           int         to store the index number of character of the String
 *        ch          char        to store the character of String k at a particular index
*/