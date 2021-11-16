import java.util.*;
class lala
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,".?!");
        int c=st.countTokens();
        if(c!=2)
        System.exit(0);
        String s1=st.nextToken();
        String s2=st.nextToken();
        StringTokenizer sq=new StringTokenizer(s1," ");
        StringTokenizer sw=new StringTokenizer(s2," ");
        String arr[]= new String[sq.countTokens()];
        int ar[]= new int[sq.countTokens()];int y=0;
        while(sq.hasMoreTokens())
        {
            arr[y]=sq.nextToken();
            ar[y]=1;
            
            y++;
        }
        for(int i=0;i<arr.length;i++)
        {
            int p=0;
            for(int k=0;k<i;k++)
            {
                if(arr[k].equals(arr[i]))
                {
                    p=1;
                    break;
                }
            }
            if(p==1)
            continue;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].equals(arr[i]))
                ar[i]++;
            }
        }
        while(sw.hasMoreTokens())
        {
            String check=sw.nextToken();
            for(int i=0;i<arr.length;i++)
            {
                if(check.equals(arr[i]))
                {ar[i]++;
                break;
            }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(ar[i]>1)
            System.out.println(arr[i]+" "+ar[i]);
            
        }
    }
}