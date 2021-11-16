import java.util.Scanner;
class orb
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL ELEMENTS");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int ar[]= new int[m*n-((m-2)*(n-2))];int k=0;
        /*1 2 3 4
         * 4 5 6 5
         * 7 8 9  6
         * 7 8 9 10
           */
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=0&&i!=m-1&&j!=0&&j!=n-1)
                    continue;
                else
                {   ar[k]=arr[i][j];
                    k++;}
            }
        }
        int min=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            for (int j=0;j<ar.length-i-1;j++)
            {
                if(ar[j+1]<ar[j])
                {
                    int temp = ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        k=0;
        for(int i=0;i<n;i++,k++)
        {
            arr[0][i]=ar[k];
        }
        for(int i=1;i<m;i++,k++)
        {
            arr[i][n-1]=ar[k];
        }
        for(int i=n-2;i>=0;i--,k++)
        arr[m-1][i]=ar[k];
        for(int i=m-2;i>0;i--,k++)
        arr[i][0]=ar[k];
        System.out.println("REARRANGED ELEMENTS");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int a=0;
        System.out.println("BOUNDARY ELEMENTS");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=0&&i!=m-1&&j!=0&&j!=n-1)
                { System.out.print("  ");  continue;}
                System.out.print(arr[i][j]+" ");
                a=a+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("SUM OF THE OUTER ROW AND COLUMN ELEMENTS ="+a);
    }
}