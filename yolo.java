import java.util.Scanner;
class yolo
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out .println("enter sentence");
        String s = sc.nextLine();
        s=s.trim();
        for(int i=0,j=1;i<s.length()-1&&j<s.length();i++,j++)
        {
            char ch=s.charAt(i);
            char c= s.charAt(j);
            if(ch==c)
            {
                if (c==' ')
              continue;  
              else
              System.out.print(ch);
            }
            else
            System.out.print(ch);
        }
        char v= s.charAt(s.length()-1);
        System.out.print(v);
    }
}