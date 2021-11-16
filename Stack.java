import java.util.*;
import java.io.*;
public class Stack
{
    String st[];
    int size;
    int top;
    int ctr;
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the stack");
        int cap = sc.nextInt();
        Stack obj = new Stack(cap);
        int m = 1;
        while(m!=0)
        {

            System.out.println("1.Push 2.pop 3. display 4.end");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Enter string to add");
                String s = sc.next();
                String a =sc.nextLine();
                s=s+" "+a;
                obj.pushname(s);
                break;
                case 2:
                String k=obj.popname();
                break;
                case 3:
                obj.display();;
                break;
                case 4:
                System.exit(0);
                break;
            }
            m++;
        }
    }

    Stack(int cap)
    {
        size = cap;
        st = new String[size];
        top = -1;
        ctr = 0;
    }

    void pushname(String n)
    {
        if(top == (size-1))
        {
            System.out.println("Overflow");
        }
        else
        {
            top = top+1;
            st[top] = n;              
        }
    }

    String popname()
    {
        if(top == -1)
        {
            System.out.println("Underflow");
            return "";
        }
        else
        {
            String s =  st[top];
            top =top-1;
            return s;
        }
    }

    void display()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = top;i>=0;i--)
        {
            System.out.println(st[i]);
        }
    }
}
