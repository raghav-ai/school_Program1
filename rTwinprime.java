/*Program is to check whether the two given numbers our twin primes or not, Using recursion.
 * Two numbers our Twin prime if the numbers our primes and have a composite number between them.
 * Example:- 2,3 is not twin prime as there is no composite number between them.
 * (3,5) or (5,7) is twin prime as they have a composite number between them and because they are prime.
*/  
import java.util.Scanner;
class rTwinprime
{
    int checkPrime(int n,int i)
    {
        if(i==n)
            return 1;
        else if(n%i==0||n==1)
            return 0;
        else 
            return checkPrime(n,i+1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int b=sc.nextInt();
        int m=sc.nextInt();
        if(b-m==2||m-b==2)
        {
            rTwinprime obj = new rTwinprime();
            if(obj.checkPrime(b,2)==1&&obj.checkPrime(m,2)==1)
                System.out.println("The Twin Prime Numbers");
            else
                System.out.println("The numbers our not twin primes");
        }
        else 
            System.out.println("The numbers our not twin primes");
    }
}
/* Variable Data Table(VDT)
 * Variable Name     Datatype    Use
 *      b               int      Stores a number of the two given numbers
 *      m               int      Stores the other number of the two given numbers
 *      n               int      stores the number to be checked whether the number is prime or not
 *      i               int      It is used to check whether the number is divisible by a number below it(checks for factor)
*/
