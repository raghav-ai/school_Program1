import java.util.Scanner;
class zero
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ;i<= 9;i++)
        {
            for (int j = 0;j<=i;j++)
            {
                int k = j*i;
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}
                
        