import java .util.Scanner;
class mcq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students,total number of q -5");
        int n=  sc.nextInt();
        char ch[][] = new char[n][5];

        for(int i=0;i<n;i++)
        {
            System.out.println("enter results of all students");
            String s = sc.next();
            s=s.toUpperCase();
            for(int j=0;j<5;j++)
            {   
                
                ch[i][j]=s.charAt(j);
            }
        }

        char c[]= new char [5];
        int counter[]= new int[n];
        System.out.println("enter solution set");
        String s = sc.next();
        s=s.toUpperCase();
        for(int i=0;i<5;i++)
        {
            
            c[i]= s.charAt(i);
        }
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(ch[i][j]==c[j])
                    counter[i]++;
            }
        }
        int max=counter[0];
        int v =0;
        for(int i=0;i<n;i++)
        {
            System.out.println("paricipant "+(i+1)+" :"+counter[i]);

        }
        for(int i=0;i<n;i++)
        {
            if(max<counter[i]){
                max = counter[i];
                System.out.println("highest of paricpant"+(i+1)+" :"+max);
                
                v++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(v==0)
            if(counter[i]==0)
            System.out.println("highest of paricpant"+(i+1)+" :"+max);
    }
}
}        