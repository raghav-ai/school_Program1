import java .util.Scanner;
class ifel
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        if(n==5||n==2)
        {
            System.out.println("less than five");
        }
        else if(n>=10)
        {
            System.out.println("hello");
        }
        else
        {
            System.out.println("greater or equal to five");
        }
    }
}