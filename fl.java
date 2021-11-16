import java.util.Scanner;
class fl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=((int)n/i);
        }
        int c=0;
        int p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]==arr[i])
                c=1;
            }
                if(c==0)
                p=p+1;
            c=0;
        }
        System.out.print(p);
    }
}