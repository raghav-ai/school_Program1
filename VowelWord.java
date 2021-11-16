import java.util.Scanner; 
class VowelWord
{
    String str;
    int freq;
    VowelWord()
    {
        str="";
        freq=0;
    }

    void readstr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        str= sc.nextLine();
        str=" "+str;
    }

    void freq_vowel()
    {
        char ch[] = str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            
           
            if(ch[i]==' ')
            {
                if(ch[i+1]=='a'||ch[i+1]=='e'||ch[i+1]=='i'||ch[i+1]=='o'||ch[i+1]=='u'||ch[i+1]=='A'||ch[i+1]=='E'||ch[i+1]=='I'||ch[i+1]=='O'||ch[i+1]=='U')
                {
                    freq = freq+1;
                }
            
            else continue;
        }
    }
    }
    
    void display()
    {
        System.out.println(str +"\tfrequency = "+freq);
    }
    
    public static void main(String args[])
    {
        VowelWord obj = new VowelWord();
        obj.readstr();
        obj.freq_vowel();
        obj.display();
    }
}