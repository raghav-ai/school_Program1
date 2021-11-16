import java.util.Scanner;
class rgcd
{
    int i=1;
    int max;
    int gcd(int a,int b)
    {
        if(i<=a&&i<=b)
        {
            if(a%i==0&&b%i==0)
            {
                max = i;
                i++;
                return gcd(a,b);
            }
            else
            {
                i++;
                return gcd(a,b);
            }
            
        }
        else
        return max;
    }
}