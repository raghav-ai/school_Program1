import java . util.Scanner ;
class greatest
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 10 no.s");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
             
        
        
        
        
        
        int f= Math.max(z,x);
        int g= Math.max(c,v);
        int h= Math.max(b,n);
        int j= Math.max(m,a);
        int k= Math.max(s,d);
        int l= Math.max(f,g); 
        int q= Math.max(h,j);
        int w= Math.max(l,q);
        int r= Math.max(w,k);
        System.out.println(r);
    }
}
