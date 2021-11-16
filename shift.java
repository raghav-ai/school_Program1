/* Program to shift the elements of the row above each row.(Using Object passing)
*/
import java.util.Scanner;
class shift
{
    int arr[][];
    int n;
    int m;
    shift(int mm,int nn)
    {
        n=mm;m=nn;
        arr = new int [n][m];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int mm=sc.nextInt();
        int nn= sc.nextInt();
        shift p = new shift(mm,nn);
        p.input();
        p.cyclic(p);
        p.display();
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void cyclic(shift p)
    {
        int temp=0;
        for (int i=0;i<m;i++)
        {
            temp=p.arr[0][i];
            for(int j=0;j<n-1;j++)
            {
                p.arr[j][i]=p.arr[j+1][i];
            }
            p.arr[n-1][i]=temp;
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/* Variable Data Type(VDT)
 * Variable Name     Datatype   Use
 *  n ,nn            int        number of rows
 *  m,mm             int        number of columns
 *  arr              int        store the number of the array
 *  temp             int        to store elements temporarily
 *  i,j              int        loop variables
*/