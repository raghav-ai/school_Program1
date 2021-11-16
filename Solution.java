import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int C[]= new int[n];
        String s= sc.next();
        s=s+sc.nextLine();
        s=s+' ';
        String s1="";

        for(int i=0,j=0;i<n;j++)
        {
            char ch = s.charAt(j);
            if(ch==' ')
            {
                C[i]=Integer.parseInt(s1);
                s1="";
                i++;
            }
            else
            {
                s1=s1+ch;
            }
        }
        int counter=0;
        int c=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(C[i]<C[j])
                c++;
            }
            counter=counter+c;
            c=0;
        }
        System.out.println(counter);
    }
}
 