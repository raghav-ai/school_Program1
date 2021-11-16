/*Program to mirror the elements of the square matrix
 * example
 *    input       output
 *    1 2 3       3 2 1
 *    4 5 6       6 5 4
 *    7 8 9       9 8 7
   */
import java.util.Scanner;
class mirror
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row (square matrix)");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[][]= new int [n][n];
        int ar[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-1,k=0;j>=0;j--,k++)
            {
                ar[i][j]=arr[i][k];

            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*Variable Data Table(VDT)
 * Variable Name    Datatype   use
 *     n            int        store the number of rows or column
 *     arr          int        stores the input elements in the array
 *     ar           int        stores the mirrored elements of array arr
*/
  