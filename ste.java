import java.util.Scanner ;
class ste
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a word");
        String s = sc.next();
        System.out.println("enter a word");
        String s1 =sc.next();
        int i = s.compareTo(s1);
        System.out.println(i);
    }
}