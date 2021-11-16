// to find the lowest common multiple of two numbers
import java .util.Scanner;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 2 no.");
        int n = sc.nextInt();
        int m= sc.nextInt();
        int arr[]= new int[n];
        int ar[]=new int [m];
        int counter =0;
        for (int i=1;i<=m;i++)
        {
            ar[i-1]= n*i;
        }
        for (int i=1;i<=n;i++)
        {
            arr[i-1]=m*i;
        }
        for(int i= 0;i<n;i++)
        {

            for (int j =0;j<m;j++)
            {
                if (ar[j]==arr[i])
                {
                    counter++;
                    break;
                }
            }
            if(counter==1)
            {
                System.out.println("lcm"+arr[i]);
                break;
            }
        }
        if(counter==0)
        {
            System.out.println("lcm"+(n*m));
        }
    }
}
/* vdt
   variable         type             use
      n              int            to store  first no.
      m              int           to store second no.
     arr             int           to store multiples of m
      ar             int           to store multiples of n
      counter        int           to store value
      i              int           to store value
      j              int           to store value
*/