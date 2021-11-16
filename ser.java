import java .util.Scanner ;
class ser
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        double n = sc.nextDouble();
        double q =1;
        double p =0;
        double counter =1;
        for (int i =1;i<=n;i++)
        {
            q=1;
            for (int j=1;j<=i;j++)
            {
                q=q*j;
                if(j==i)
                {
                    
                    
                        p=p+(i/q);
                    
                }
            }

        }
        p=p-1;
        System.out.println(p);
    }
}