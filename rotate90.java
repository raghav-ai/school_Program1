/*Program to inputt an of size m x n array and to rotate it by 90 degrees
 * Example
 * input:- 3,3       output
 * 1 2 3            7 4 1
 * 4 5 6            8 5 2
 * 7 8 9            9 6 3
   */
import java.util.Scanner;
class rotate90
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of m,n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]= new int [m][n];
        int ar[][]= new int[m][n];
        System.out.println("enter values total values needed ="+m*n);
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=n-1,k=0;i>=0;i--,k++)
        {
            for(int j=0;j<m;j++)
            {
                ar[j][i]= arr[k][j];
            }
        }
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/* Variable Data Table(VDT)
 * Variable name     Datatype       use
 *  m                int            stores the number of rows.
 *  n                int            stores the number of columns
 *  arr              int            stores the value of the array tobe rotated 90 degrees
 *  ar               int            stores the rotated array.
 *  i,j,k            int            loop variables.
*/      