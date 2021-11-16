/*
 * program to show lucky series to a particular number below 50
*/
import java .util.Scanner;
class lucky
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int arr[]= new int [n];
        int counter = 0;
        int j =2;
        
        if(n<=50)
        {
            for( int i=0;i<n;i++)
            {
                arr[i]= i+1;
            }
            for (int p = 0;p<n;p++,j++)
            {
                
                
                for(int i = 0; i<n;i++)
                {
                    if(arr[i]!=0)  
                    {
                        counter= counter +1;
                        if(counter ==j)
                        {
                            arr[i]=0;
                            counter=0;
                        }
                    }
                   
                }
                counter =0;
            }
            for(int i =0;i<n;i++)
            {
                if(arr[i]!=0)
                {
                    System.out.print(arr[i]+" ");
                    
                }
            }
            System.out.println();
        }
        else
        System.out.println("no. not less than equal to 50");
    }
}
/* vdt          
 *  variable        type      use
 *  arr              int      stores the  values of the array 
 *  n                int      stores no.of elements
 *  counter          int      loop variable
 *  p                int      loop variable
 *  i                int      loop variable
 *  j                int      checks the no.to be removed
 */