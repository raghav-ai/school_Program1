import java .util.Scanner ;
class spy 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();int p=1;;int m = 0;
        while (n>0)
        {
            m=m+(n%10);
            p=p*(n%10);
            n=n/10;
        }
        if (p==m)
        {
            System.out.println("spy nombre");
        }
        else
        {
            System.out.println(" not spy nombre");
        }
    }
}