public class helloworld {
    boolean cp(int n)
    {
        int arr[]= new int[10];
        for(int i=0;i<10;i++)
        arr[i]=0;
        int c=0;
        while(n>0)
        {
            int p=n%10;
            arr[p]++;
            if((arr[p]==2))
            c=1;
            n=n/10;
        }
        if(c==1||(arr[0]!=0))
        return false;
        else 
        return true;
    }
    
    public static void main(String[] args) {
        String s="";int max=0;
        helloworld obj= new helloworld();
        for (int i=9;i<10000;i++)
        {
            for(int j=1;;j++)
            {
                int n=i*j;
                s=s+Integer.toString(n);
                if(s.length()==9)
                {
                    int a= Integer.parseInt(s);
                    boolean b=obj.cp(a);
                    if(b==true&&a>max)
                        {  
                            max=a;}
                    break;
                }
                else if(s.length()>9)
                {
                    break;
                }
            }
            s="";
        }
        System.out.println(max);
        
    }

}
