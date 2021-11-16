import java.util.Scanner;
class opppositeLoop
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
        for (int i = n;i>0;i--)
        {
            for(int j= n;j>=i;j--)
            {
                System.out.print( j +" ");
            }
            System.out.println();
        }
    }
}