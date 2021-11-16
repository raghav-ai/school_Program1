

// program to print all the characters in a sentence and the no.of times the character has been repeated
/*example
 *  COMPUTER HARDWARE
 *  A - 2
 *  C - 1
 *  D - 1 
 *  E - 2
 *  H - 1
 *  M - 1
 *  O - 1
 *  P - 1
 *  R - 3
 *  T - 1
 *  U - 1
 *  W - 1
 */
import java.util.Scanner;
public class frequency   
{  
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        int arr[] = new int[s.length()];  
        int i, j;  
         char ch[] = s.toCharArray();  
          
        for(i = 0; i <s.length(); i++) {  
            arr[i] = 1;  
            for(j = i+1; j <s.length(); j++) {  
                if(ch[i] == ch[j]) {  
                    arr[i]++;  
                      
                     
                    ch[j] = '0';  
                }  
            }  
        }  
          
      
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <arr.length; i++) {  
            if(ch[i] != ' ' && ch[i] != '0')  
                System.out.println(ch[i] + "-" + arr[i]);  
        }  
    }  
} 
/* vdt          
 *  variable        type      use
 *  arr              int      counter 
 *  s                String   stores input given by user
 *  ch               char     stores  characters part of the input
 *  i                int      loop variable
 *  j                int      loop variable
 */