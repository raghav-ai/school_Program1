/*Program to find a search element in an array using Bubble sort Recursively.
*/
import java.util.Scanner;
class rbinarys
{
    int m=0;

    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int u= sc.nextInt();
        int arr[]= new int[u];
        u--;
        System.out.println("enter elements");
        for(int i=0;i<=u;i++)
            arr[i]= sc.nextInt();
        System.out.println("enter search element");
        int s=sc.nextInt();
        int l=0;
        rbinarys obj= new rbinarys();
        int k=-1;
        k=obj.rbin(l,u,arr,s);
        if(k!=-1)
            System.out.println("element found"+(k+1));
        else
            System.out.println("element not found");
    }

    int rbin(int l,int u,int arr[],int s)
    {
        m = (l+u)/2;
        if(arr[m]!=s &&l==u)
          return -1;                                  
        if(arr[m]>s)
        { 
            u=m-1;
            return rbin(l,u,arr,s);
        }
        else if(arr[m]<s)
        {
            l=m+1;
            return rbin(l,u,arr,s);
        }
        else 
        return m;

    }
}
/*Variable data Type(VDT)
 * Variable Name    Datatype    Use
 *      u           int         store the length of the array
 *      arr         int         store the elements in the array of length u.
 *      i           int         loop variable
 *      s           int         stores the search element
 *      l           int         stores the lower limit during bubble sort
 *      m           int         stores the middle element of the lower and upper limit of the array
 *      k           int         used to check whether the element was found or not.
*/
 