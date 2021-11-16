import java.util.Scanner;
class rqw1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        s=s+" ";
        int counter=0;
        String word ="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'|| ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                counter++;
                word= word+ ch ;
            }
            else if( ch==' ')
            {
                System.out.println(word +" - "+counter);
                word="";
                counter=0;
            }
            else
            {
                word= word+ch;
            }
        }
    }
}