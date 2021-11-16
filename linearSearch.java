
// program to do a linear search using arrays

import java . util.Scanner;
class linearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int [n];
        boolean b = false;
        int i = 0;
        System.out.println("enter elements");
        for (int j = 0;i<n;i++)
        {
            
            arr[i]=sc.nextInt(); 
        }
        System.out.println("enter the number to be searched");
        int e = sc.nextInt();
        for (i = 0;i<n;i++)
        {
            if(arr[i]==e)
            {
                b = true;
                break;
            }
        }
        if (b==true)
        {System.out.println("element found  "+ " position of element " +(i+1));
        }
        else 
        {
            System.out.println("element not found" );
        }
    }
}
/* vdt          
 *  variable         type        use
 *  arr              int         stores all the numbers inputted by user 
 *  n                int         stores the array size
 *  b                boolean     if true means element found(test expression
 *  e                int         stores the search element
 *  i                int         loop variable
 */