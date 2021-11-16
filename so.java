import java.util.Scanner;
class so
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of elements");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int counter=0;
        int p=0;
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            counter=0;
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[counter]+" ");
                counter++;
                if(i==j&&j<n-p)
                {
                    counter=0;
                    j=i;
                }
            }
            System.out.println();
            p++;
        }
    }
}    