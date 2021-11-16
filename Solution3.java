import java.util.*;
class Solution3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s[]= new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]= sc.next();
        }
        String temp="";

        int m=26;
        for(int k=0;k<n;k++)
        {
            int letters[] = new int[m]; 

            // Traverse string and increment 
            // count of characters 
            for (char x : s[k].toCharArray()) { 

                // 'a'-'a' will be 0, 'b'-'a' will be 1, 
                // so for location of character in count 
                // say we will do str[i]-'a'. 
                letters[x - 'a']++; 
            } 

            // Traverse the hash say and print 
            // characters 
            s[k]="";
            for (int i = 0; i < m; i++) { 
                for (int j = 0; j < letters[i]; j++) { 
                    s[k]=s[k]+(char)(i+'a');
                }  
            }
        }

        int c=0;
        for (int j = 0; j < n - 1; j++) 
        { 
            for (int i = j + 1; i < n; i++)  
            { 
                if (s[j].compareTo(s[i]) > 0) 
                { 
                    temp = s[j]; 
                    s[j] = s[i]; 
                    s[i] = temp; 
                } 
            } 
        } 
        
        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++)
            {
                if(s[i].equals(s[j]))
                    c++;

            }
        }
        System.out.println(c);
    }
}