import java .util.Scanner;
class words
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter characters");
        char ch[][]= new char [10][10];
        for(int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                String s1=sc.next();
                ch[i][j] = s1.charAt(0);
            }
        }
        System.out.println("enter word");
        String s= sc.next();
        int counter=0;
        char ch2 []= s.toCharArray();
        for(int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                char ch1 = ch[i][j];
                if (ch1==(s.charAt(0)))
                {
                    for(int k=i;k<i+1;k++)
                    {
                        for(int l=j,m=0;l<s.length();l++,m++)
                        {
                           if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    }
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                    for(int k=j;k<j+1;k++)
                    {
                        for(int l=i,m=0;l<s.length();l++,m++)
                        {
                           if(ch[l][k] == ch2[m])
                           counter++;
                        }
                    }
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                    for(int k=j;k<j+1;k++)
                    {
                        for(int l=i,m=0;l<s.length();l--,m++)
                        {
                           if(ch[l][k] == ch2[m])
                           counter++;
                        }
                    }
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                        for(int k=i;k<i+1;k++)
                    {
                        for(int l=j,m=0;l<s.length();l++,m++)
                        {
                           if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    }
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                    for(int k=i,l=j,m=0;k<s.length();k++,l++,m++)
                    {
                     if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                    for(int k=i,l=j,m=0;k>(k-s.length());k--,l--,m++)
                    {
                     if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    
                    if(counter==s.length())
                    break;
                     else{
                         counter=0;
                        }
                    for(int k=i,l=j,m=0;k>(k-s.length());k--,l++,m++)
                    {
                     if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    
                    if(counter==s.length())
                    break;
                       else{
                         counter=0;
                        }
                    for(int k=i,l=j,m=0;l>(l-s.length());k++,l--,m++)
                    {
                     if(ch[k][l] == ch2[m])
                           counter++;
                        }
                    
                    if(counter==s.length())
                    break;   
                }
            }
        }
        if(counter==s.length())
        System.out.println("word found");
        else
        {
          System.out.println("word not found");  
        }
    }
}