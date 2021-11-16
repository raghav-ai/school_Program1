import java.util.*;
class stdemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s="";
        for(int i=0;i<3;i++)
        {
            s=s+'\n'+sc.nextLine();
        }
        StringTokenizer st = new StringTokenizer(s,"\n");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}