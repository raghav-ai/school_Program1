/* program to place the vowels before the constantsin a word of sentences
 * example 
 * the sky is white
 * output :  eth sky is iewht
*/
import java .util.Scanner ;
class vowel_constant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        s=s+" ";
        String vow="";
        String con="";
        String word="";
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                word=vow+con;
                System.out.print(word +" ");
                word="";vow="";con="";
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
               vow=vow+ch;
            }
            else
            {
                con=con+ch;
            }
        }
        System.out.println();
    }
}
/* vdt          
 *  variable         type        use
 *  word             String      counter 
 *  s                String      stores input given by user
 *  ch               char        checks whether character is vowel or consonant
 *  vow              String      stores all the vowels
 *  con              String      stores all consonants
 *  i                int         loop variable
 */