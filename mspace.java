import java.util.Scanner;
class mspace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        s=s+" ";
        String word="";
        for(int i=0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            char ch1= s.charAt(i+1);
            if(ch==ch1&&ch==' ')
            {
                continue;
            }
            else
            {
                word=word+ch;
            }
        }
        System.out.println(word);
    }
        
}