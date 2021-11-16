//program to check whether the number is an isbn number or not 
// isbn number is a ten digit number whose digit when multiplied by its position and added is divisible by 11
import java .util.Scanner ;
class isbn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a ten digit no. not starting from zero");
        long n = sc.nextLong();
         long t = n;long r = 0;
         long p = 0;long q = 0; long u = 0;
        while (n>0){       // to check whether the number is of 10 digits or not
        p = n%10;
        q++;
        n= n/10;
    }
    if (q==10){
        for (long i = 1;i<=10;i++)
        {
            r=t%10;
            u=u+(long )Math.pow(r,i);
            t=t/10;
        }
        if (u/11==0)
        {
            System.out.println("isbn");
        }
        else
        System.out.println(" not isbn");
    }
    else
    System.out.println("enter valid no. of digits");
}
}
//vdt
// variable             type                use
//   n                   long               to check whether the value is isbn value or not
//   p                   long                to store remainder of n
//   q                   long                acts as a counter
//   t                   long                contains the original value entered by the user
//   u                   long                to add the value ofdigits of t raised to the power of their position 