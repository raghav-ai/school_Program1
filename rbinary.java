import java.util.Scanner;
class rbinary
{
    

    int convert(int m,int n)
    {
        if(n==1)
        return m--;
        else 
        return ++m +convert(m,--n);
    }
}