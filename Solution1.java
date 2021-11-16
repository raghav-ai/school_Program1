import java.util.Scanner;
class Solution1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        s1= s1+sc.nextLine();
        
        
        
        String s2="";
        int c=0;
        
        
        c=s1.indexOf(' ');
        s2=s1.substring(0,c);
        int n=Integer.parseInt(s2);
        s2=s1.substring(c+1,s1.length());
        
        int k=Integer.parseInt(s2);
        
        s1="";
        s1= sc.next();

        s1=s1+sc.nextLine();
        s1=s1+" ";
        c=0;
        s2="";
        int H[]= new int[n];
        if(n<0||n>10000||k<1||k>10000000)
        System.exit(0);
        
        for(int i=0;i<n;i++)
        {
            int d=s1.indexOf(' ',c);
            s2=s1.substring(c,d);
            H[i]=Integer.parseInt(s2);
            c=d+1;
        }
        c=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=2;j<H[i];j++)
            {
                if(H[i]%j==0)
                c++;
            }
            if(c==0)
            {
                if((H[i]%k)>max)
                    max=H[i]%k;
            }
        }
        System.out.println(max);
    }
}
              
        
 