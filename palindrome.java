import java .util.Scanner;
class palindrome
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();int p = 0;int i =0;
        int t = n;int q = n;int count=0;int r =0;
        while(n>0)
        {
            i=n%10;
           
            count ++;
             n=n/10;
        }
        for(;count>0;count--)
        {
            p=t%10;
            r = r+(p*(int) Math.pow(10,(count-1)));
            t=t/10;
        }
        if(r==q)
         System.out.println("palindrome");
       else
       System.out.println("not palindrome");
    }
}