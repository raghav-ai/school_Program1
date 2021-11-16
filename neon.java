//to check whether a number is a neon number or not

import java.util.Scanner;
class neon
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int sum = 0;
        int k = n*n;
        while(k>0)
        {
            int m = k%10;
            sum = sum+m;
            k= k/10;
        }
        if (sum==n)
        {
            System.out.println("it is a neon");
        }
        else 
        {
            System.out.println("it is not a neon");
        }
    }
}
//vdt table
 // variable      type           use 
 //  n             int          to store the value inputted by the user 
 //  k             int          to store the square of n
 //  m             int          to store the remainder when variable k is divided by 10
 //  sum           int          to add the remainder
    
//answer
//9    neon number
//4    not neon number
//1    neon number






















        