// Program to reverse the number at each element of the array
import java .util.Scanner;
class MatRev
{
    int arr[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        n=nn;
        m=mm;
        arr=new int [m][n];
    }

    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of arrary");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    int reverse(int x)
    {
        StringBuffer s = new StringBuffer(Integer.toString(x));
        s.reverse();
        String S = s.toString();
        return Integer.parseInt(S);
    }

    void RevMat(MatRev p)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=p.reverse(arr[i][j]);
            }
        }
    }

    void show()
    { for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {    
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of n,m");
        int nn= sc.nextInt();
        int mm= sc.nextInt();
        MatRev p=  new MatRev(mm,nn);
        p.fillarray();
        p.RevMat(p);
        p.show();
    }
}
/* Variable data Table(VDT)
 * Variable Name    Datatype     Use
 * n,nn             int          number of rows
 * m,mm             int          number of columns
 * arr              int          elements of the array
 * i,j              int          loop variables
 * s                StringBuffer  to reverse the string
 * S                String        to store the reversed word
*/                
                


        