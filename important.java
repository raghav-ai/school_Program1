/* Program to print the original array, array with the inner elements sorted, and only diagonals.
 * constraint- no.of rows,columns should be greater than 4 and less than 11
*/
import java.util.Scanner;
class important
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of m");
        int m=sc.nextInt();
        if(m<=3||m>10){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int arr[][]= new int[m][m];
        System.out.println("enter value of arr");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int c = (m-2)*(m-2);
        int a[]= new int[c];
        int k=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                if((i==0||i==m-1) ||( j==0||j==m-1))
                    continue;
                else{
                    a[k]= arr[i][j];
                    k++;
                }
            }
        }
        k=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-i-1);j++)
            {
                if( a[j+1]<a[j]){
                    int t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rearranged matrix");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                if((i==0||i==m-1) ||( j==0||j==m-1))
                    System.out.print(arr[i][j]+" ");
                else{
                    System.out.print(a[k]+" ");
                    k++;}
            }System.out.println();
        }
        k=0;
        System.out.println("with diagonal");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                if((i==0||i==m-1) &&( j==0||j==m-1))
                    System.out.print(arr[i][j]+" ");
                else if((i==0||i==m-1) ||( j==0||j==m-1))
                    System.out.print(" ");
                else{
                    System.out.print(a[k]+" ");
                    k++;}
            }
            System.out.println();
        }
        
       
}
}
/* Variable Data Table(VDT)
 * Variable Name     Datatype     Use
 *      m            int          number of rows and columns
 *      arr          int          stores the value in the array
 *      c            int          store the number of of elements excluding the boundary method
 *      i,j,k        int          loop variables
 *      a            int          store the inner part of the array
*/        
        
