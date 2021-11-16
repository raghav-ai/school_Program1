import java.util.Scanner ;
class ok
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        int x = 0;
        for( x = -10;x>=-10 && x<=10;x=x+2)
        {
            double k=(Math.pow(x,2)+((3/2)*x)+5)/(x-3);
            System.out.println(k+" ");
            
        }
    }
}