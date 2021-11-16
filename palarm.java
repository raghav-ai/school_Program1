import java .util.Scanner;
class palarm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("enter a number");
            int n= sc.nextInt();
            System.out.println("enter 1 or 2 or zero to end loop");
            int a = sc.nextInt();
            if(a==0)
            {
                System.out.println("loop terminated");
                break;
            }
            switch(a)
            {   
                case 1:
                {
                    int m=n;
                    double k=0;
                    int counter=0;
                    while(m>0)
                    {
                        counter++;
                        m=m/10;
                    }
                    m=n;
                    for (int i=1;i<=counter;i++)
                    {
                        int p= m%10;
                        k = k+(Math.pow(10,counter-i)*p);
                        m=m/10;
                    }
                    if(k==n)
                        System.out.println("true");
                    else
                        System.out.println("false");

                    break;
                }
                case 2:
                {
                    int m=n;
                    double k=0;
                    while(m>0)
                    {
                        int p = m%10;
                        k= k+(Math.pow(p,3));
                        m=m/10;
                    }
                    if(k==n)
                        System.out.println("armstong");
                    else
                        System.out.println("n armstrong");
                    break;
                }
                default:
                System.out.println("wrong input");
                break;
            }
        }
    }
}
