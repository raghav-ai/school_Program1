import java .util.Scanner;
class ha

{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 3 integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt ();
        if (a>b && a>c)
        {
            if (b>c)
            {
                System.out.println(a+" "+b+" "+c+" ");
            }
            else
            {
                System.out.println(a+" "+c+ " "+b+" ");
            }
        }
        else if (b>c && b>a)
        {
            if (a>c)
            {
                System.out.println(b+" "+a+" "+c+" ");
            }
            else 
            {
                System.out.println(b+" "+c+" "+a+" ");
            }
        }
        else
        {
            if(a>b)
            {
                System.out.println(c+" "+a+" "+b+" ");
            }
            else
            {
                System.out.println(c+" "+b+" "+a);
        }
    }
}
}



                
        
            
        