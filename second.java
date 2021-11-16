import java .util.Scanner;
class second 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter three Intgers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<c&&a>b)
        {
          System.out.println(" The second largest number is = " +a);
        }
        else if (b>a&&a>c)
        {
            System.out.println(" The second largest number is = " +a);
        }
        else if ( b<a && b>c)
        {
            System.out.println(" The second largest number is = " +b);
        }
        else if ( b<c && b>a)
        {
            System.out.println(" The second largest number is = " +b);
        }
        else if ( c<b && c>a)
        {
            System.out.println(" The second largest number is = " +c);
        }
        else 
        {
            System.out.println("The second largest number is = " +c);
        }  
        }}