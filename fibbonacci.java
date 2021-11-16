
import java.util.Scanner;
class fibbonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        int sum =0;int m=1;
        for(int i=0;sum<n;)
        {
          
          System.out.println(sum);
          i=m;
          m = sum;
          sum= i+m;
        }
    }
}