import java.util.Scanner;
class mobius
{
    boolean cp(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=2;
        mobius obj = new mobius();
        int pr=1;int l=0;int t=n;int c=0;
        if(n==1)
        {
            System.out.println("1");
            System.exit(0);
        }
        while(n>1)
        {
            if(obj.cp(k))
            {
                if(n%k==0)
                {
                    if(l==k)
                    {System.out.println("0");System.exit(0);}
                    pr=pr*k;
                    l=k;
                    c++;
                    n=n/k;
                }
                else
                {
                    k++;
                }
            }
            else k++;
        }
        if(pr==t)
        System.out.println((int)Math.pow(-1,c));
        
    }
}