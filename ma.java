import java.util.Scanner;
class ma
{
    public static void main(String args[])
    {
        int a = 4;int b=5;
        a/=++a+ ++b%4*++b/a++;
        System.out.println(a);
    }
}
// a= 5+5%4*6/5
//