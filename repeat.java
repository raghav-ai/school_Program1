//program to show the repeated words in a sentence
import java .util.Scanner;
class repeat
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char ch = ' ';
        s=s+" ";
        String word [] ;
        char zx = ' ';
        int counter = 0;
        String word1 = "";
        for (int i = 0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
            { 
                counter++;

            }
        }
        word = new String [counter];int k=0;
        for (int j = 0;j<s.length();j++)
        {
            zx=s.charAt(j); 
            if (zx!=' ')
            {
                word1 = word1+zx;
            }
            else
            {
                if(k<counter)
                {
                    word [k] =word1;
                    k++;
                    word1 = "";
                }
            }
        }
        for (int i = 0;i<(counter- 1);i++)
        {
            for (int j= 1+i;j<counter;j++)
            {
                if (word[i].equals(word[j]))
                {
                    
                    System.out.println(word[j]);
                    break;
                }
                
                
                
            }
        }
    }
}
/* vdt          
 *  variable         type        use
 *  word             String      stores all characters of the input
 *  s                String      stores input given by user
 *  ch               char        stores character temporarily of s
 *  zx               char        stores character temporarily      
 *  counter          int         stores no. of spaces
 *  i                int         loop variable
 *  j                int         loop variable
 *  k                int         loop variable
 *  word1            String      stores words of the input 
 */