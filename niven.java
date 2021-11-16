// program to check whether a given number is a niven number or not
import java . util.Scanner ;
class niven
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        int sum=0;
        while (n>0)     
        {                  
            int k=n%10;  //extracting the digits of the number 
            sum=sum+k;   //  ading the extracted numbers
            n=n/10;      // removing that number from the original number
        }
        if(n%sum==0)
        System.out.println("niven");
        else
        System.out.println("not niven");
    }
}
//  vdt
// variable       type     use
//    n            int     to get input from the user
//    sum          int     to add the extracted values
//    k            int      to store the extracted value 

// answers
//  200
//  niven


//   13
//  not niven

//  153
//  niven

