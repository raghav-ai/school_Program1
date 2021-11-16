//Program to print all the fibonacci word till a particular number
import java.util.Scanner;
class FiboString
{
    String x,y,z;
    int n;
    FiboString()
    {
        x="a";
        y="b";
        z="ba";
        n=0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n=  sc.nextInt();
    }

    void generate()
    {
        for (int i=0;i<=n;i++)
        {
            System.out.print(z+" ");
            x= y;
            y=z;
            z= y+x;
        }
    }
    public static void main(String args[])
    {
        FiboString obj = new FiboString();
        obj.accept();
        obj.generate();
    }
}
/* Variable Data Table(VDT)
 * Variable Name    Datatype    Use
 *  i               int         loop variable
 *  x               String      to store the n-2 word
 *  y               String      to store the n-1 word
 *  z               String      to store the n fibonacci word
 *  n               String      to store the numbe of fibonacci words to be printed
*/
