import java.util.Scanner ;
class hoop
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter a number");
        int i = sc.nextInt();
        for( int n = 1;n<=i;n++)
        {
            for(int j = 1;j<=n;j++)
            {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}
          
            