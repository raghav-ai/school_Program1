 /* program to find the saddle point of an array
 * Saddle point in a matrix. Given a matrix of n x n size, the task is to find saddle point of the matrix.
 * A saddle point is an element of the matrix such that it is the minimum element in its row and maximum in its column.
*/
import java.util.Scanner;
class saddle_point
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]= new int [r][c];
        System.out.println("enter values");
        for(int i = 0;i<r;i++)
        {
            for (int j = 0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int store =0;                //  6 3 1 
        int max =arr[0][0];          //  9 7 8 
        int max1 =0  ;               //  2 4 5 
        int counter=0;
        for(int j =0;j<r;j++)
        {
            
            counter =0;
            max=arr[j][0];
            store=0;
            for( int i = 0 ;i<c;i++)
            {   
                
                if(arr[j][i]<max)
                {
                    max=arr[j][i];
                    store =i;
                    
                }
                    if(i==(c-1))
                    {
                    for(int col = store,row = 0;row<r;row++)
                    {
                        
                            if(arr[row][col]>max)
                                {
                                    
                                counter++;
                            }
                    }
                    break; 
                }
            
            }
            if(counter==0)
            {
                System.out.println(max+" saddle point");
                break;
            }
        }
        
    }
}
/*  vdt
    variable        type          use
       r            int           to store no. of rows
       c            int           to store no.of columns
       arr          int           to store values of matrix
       store        int           stores value of the row element which is greatest
       max          int           stores maximum value of row
       max1         int           stores maximum value of row
       counter      int           loop variable
       i            int           loop variable
       j            int           loop variable
*/     