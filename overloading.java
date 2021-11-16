/* write a program to show function overloading
 * instance variables-
 * int a,b
 * String c,d
 * Float e,f
 * 
 * function name s
 * s(int a ,int b) - add the integers
 * s(String c,String d)-concat the strings
 * s(float e,float f)- divide e by f
 */
import java .util.Scanner;
class overloading 
{
    int a;
    int b;
    String c; String d;
    float f;float e ;
    void s(int a, int b)//adding the integers
    {
         
        System.out.println((a+b));
    }
    void s(String c ,String d)
    {
        System.out.println(c+ d);//concatenation
    }
    void s(float f,float e)//divide e by f
    {
       
        System.out.println((e/f));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        overloading obj= new overloading();//creating object
        obj. s (9,2);         //calling function
        obj.s ("sdf","ghj"); //calling function
        obj. s(5.1f,5.2f); //calling function
    }
}
/* vdt
 variable         type         use
    a              int          to store value
    b              int          to store value
    c              String       to store value
    d              String       to store value
    f              float        to store value
    e              float         to store value
*/    