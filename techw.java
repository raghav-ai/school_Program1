import java .util.Scanner;
class techw
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a even digit number");
        int n = sc .nextInt();
        int t = n;int a= n;
        int q=0; double s=0;double p =0;
        while(t>0)
        {
            t=t/10;
            q++;
        }
        if(q%2==0)
        {
         for(int i=0;i<(q/2);i++)
         {
             s=s+((a%10*(Math.pow(10,i))));
             a=a/10;
            }
           for(int i=0;i<(q/2);i++)
         {
             p=p+((a%10*(Math.pow(10,i))));
             a=a/10;
            }
            double w=Math.pow((p+s),2);
            if (w==n)
            System.out.println("tech number");
            else
            System.out.println("not tech number");
        }
        else{
            System.out.println("not an even digit number");
        }
    }
}
  /* vdt
   * variable            type            use
   *  n                  int            stores the input from user
   *  t                  int            stores the same value of n
   *  a                  int            stores the same value of n
   *  q                  int            stores length of number
   *  s                  double         stores first half of number
   *  p                  double         stores second half of number
   *  w                  Double         stores the final value that needs to be checked 
   *  i                  int            loop variable
   */
    