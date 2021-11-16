import java.util.Scanner;

public class Solution2 {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        int arr[]=new int [26];
        a=a.toLowerCase();
        b=b.toLowerCase();

        for(int i=0;i<a.length();i++)
        {
            char ch= a.charAt(i);
            arr[ch-97]=arr[ch-97]+1;
        }

        int ar[]=new int[26];

        for(int i=0;i<b.length();i++)
        {
            char ch= b.charAt(i);
            ar[ch-97]=ar[ch-97]+1;
        } 
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=ar[i])
            {
                c=0;
                break;
            }
            else
                c++;
        }
        if(c!=0)
            return true;
        else return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
