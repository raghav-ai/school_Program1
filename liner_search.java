// program to do a linear search using arrays
import java .util.Scanner ;
class liner_search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[]={25,13,76,98,45};
        System.out.println("enter the value to be searched");
        int e = sc.nextInt();boolean b=false;
        for (int i=0;i<=4;i++)
        {
            if (arr[i]==e){
                 System.out.println("element found "+i);
                 b=true;
                 break;
                }
            }
            if (b==false)
            { System.out.println("element not found");
            }
        }
    }