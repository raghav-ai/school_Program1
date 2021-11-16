import java.util.Scanner;
class spal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        s1= s1.reverse();
        System.out.println(s1);
        if(s.equals(s1))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println(" not palindrome");
        }
    }
}
