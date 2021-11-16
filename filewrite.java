import java.util.*;
import java.io.*;
class filewrite
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        FileWriter file = new FileWriter("c:\\Users\\ragha\\Desktop\\names.txt");
        BufferedWriter br = new BufferedWriter(file);
        PrintWriter m = new PrintWriter(br);
        for(int i=0;i<5;i++)
        {
            m.println(sc.nextLine());
            
        }
        m.close();
        br.close();
        file.close();
        
    }
}