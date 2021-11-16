import java .util.Scanner;
class sa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        s= s+" ";
        int counter=0;
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
                counter++;
        }
        int arr[]= new int[counter];
        int n=0;
        for(int i=0,j=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                arr[j]=n;
                n=0;

                j++;
            }
            else
            {
                n=n+(int)ch;
            }
        }
        String word ="";
        for(int i=0,j=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                System.out.println(word+ " = "+arr[j]);
                j++;
                word="";
            }
            else
                word=word+ch;
        }
    }
}