//Program to print all the names in a file using file reader
import java.util.*;
import java.io.*;
class fileread
{
    public static void main(String args[])throws IOException
    {
        FileReader file = new FileReader("c:\\Users\\ragha\\Desktop\\names.txt");
        BufferedReader br = new BufferedReader (file);
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
        br.close();
        file.close();
    }
}