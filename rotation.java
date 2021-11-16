/* the program is to rotate a matrix by 90 degrees
*/
import java .util.Scanner;
class rotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        System.out.println("enter elements");
        for (int i = 0;i<n;i++)
        {
            for (int j=0;j<n;j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int ar[][] =new int[n][n];
        for (int i =0,col=(n-1);i<n;i++,col--)
        {
            for (int j =0,row=0;j<n;j++,row++)
            {
                ar[row][col]=arr[i][j];
            }
        }
        for (int i = 0;i<n;i++)
        {
            for (int j=0;j<n;j++) 
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/* vdt          
 *  variable         type        use
 *  arr              int         stores all the numbers inputted by user 
 *  n                int         stores the array size(rows and column)
 *  ar               int         stores the rotated array 
 *  i                int         loop variable
 *  j                int         loop variable
 */