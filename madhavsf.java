import java.util.Scanner;
class madhavsf
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s="world";
        String s1="helloIQ ";
        s1 = s1.concat(s);
        System.out.println(s1+" "+s);
        int i = s1.indexOf('I',5);
        System.out.println(i);

    }
}