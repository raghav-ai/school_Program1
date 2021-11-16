import java .util.Scanner;
class rqw3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n = sc.nextInt();
        System.out.println("enter which series to follow");
        int m = sc.nextInt();
        double arr[] = new double[n];
        arr[0]=1;
        for (int i=1;i<n;i++)
            arr[i]= arr[i-1]+2;
        switch(m)
        {
            case 1:
            {
                double sum =0.0;
                for (int i= 1;i<=n;i++)
                {
                    sum = sum + 1/Math.pow(2,i);
                }
                System.out.println(sum);
                break;
            }
            case 2:
            {
                double sum =0.0;
                double s =0;
                double l =2;
                double k=0;
                double d=1;
                for (int i=1;i<=n;i++)
                {
                    if(i==1)
                        k=l;
                    if (i==2)
                    {
                        
                        k=l+arr[1];
                    }
                    else if(i>2)
                    {
                        s = k+arr[i-1];
                        k=s;
                        
                    }

                    if(i%2==0)
                    {

                        for(int j=1;j<=k;j++)
                        {
                            d= d*j;
                        }
                        sum = sum -(i/d);

                        d=1;
                    }
                    else
                    {

                        for(int j=1;j<=k;j++)
                        {
                            d= d*j;
                        }
                        sum = sum +(i/d);
                        d=1;
                    }
                    
                }
                System.out.println(sum);
                break;
            }
            default:
            {System.out.println("enter valid number");
                break;
            }
        }

    }
}

