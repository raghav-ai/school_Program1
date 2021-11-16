/* Program to print element of the series (Using recursion)
 * Example 
 * input 5
 * output
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
*/
import java.util.Scanner;
class rseries
{
    
    int count;
    int m=1;
    void rse(int l,int count)
    {
        if(m<=l)
        {
            if(count<=m)
            {
                System.out.print(count+" ");
                count++;
                
                if(count<=m)
                rse(l,count);
            }
            m++;
            System.out.println();
            rse(l,1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. of lines");
        int l=sc.nextInt();
        rseries obj= new rseries();
        obj.rse(l,1);
    }
}
/* Variable data Table(VDT)
 * Variable Name    Datatype    Use
 *         l        int         stores the input element 
 *         count    int         limit of elements to be printed in the line
 *         m        int         stores the line number
*/