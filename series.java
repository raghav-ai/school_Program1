//  program to calculate the sum of the series
import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double sum = 1;
        for(int i=1;i<=n;i++)
        {
            sum= sum +1.0/i;
            
            System.out.print(sum);
        }
    }
}
            
            //VDT
       // variable          type             use
       //  n                 int             to  store the number till which the seriesshall run
       //  sum               double          to keep it fractional form 
       // i                  int             
             