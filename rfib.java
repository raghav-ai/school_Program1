import java.util.Scanner;
class rfib
{   
    int x,y,z,counter;
    rfib(){
    y=1;
    x=0;z=0;counter=0;
}
    int fib(int n)
    {
        if(counter<n)
        {
            
            counter++;
            System.out.println(z);
            z=x+y;
            x=y;
            y=z;
            return fib(n);
        }
        else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rfib obj = new rfib();
        obj .fib(n);
        
    }
}
