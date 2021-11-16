import java.util.Scanner;
class n
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;int sum=0;
        /*
        00 01 02 03 04 05 
        10 11 12 13 14 15
        20 21 22 23 24 25
        30 31 32 33 34 35
        40 41 42 43 44 45
        50 51 52 53 54 55
         */
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if(sum>max)
                    max=sum;
                sum=0;
            }
        }
        System.out.println(max);    
    }
}