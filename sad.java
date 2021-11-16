import java.util.Scanner;
class sad
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word then sentence");
        
        String s= sc.nextLine();
        String w=sc.next();
        s=s+" ";
        String a = "";
        String b="";
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch==' ')
            {
                if(a.equals(w))
                {
                    a="";
                    continue;
                }
                else
                {
                   b= b+a+" "; 
                   a="";
                }
            }
            else
            {
                a=a+ch;
            }
        }
        System.out.println(b);
    }
}
    