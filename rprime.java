import java.util.Scanner;
class rprime
{
    int i=2;
    boolean isprime(int n)
    {
        if(i<n){
            if(n%i==0)
            {

                return false;
            }
            else
            {   
                i++;
                return isprime(n);
            }
        }
        else
        {return true;
        }
    }
}