import java .util.Scanner;
class square
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();//4
        char ch = sc.next().charAt(0);//a
        char ch1 = sc.next().charAt(0);//b
        char ch2 = sc.next().charAt(0);//c
        char arr[][] = new char[i][i];
        for(int r =0;r<i;r++)
        {
            for (int c = 0;c<i;c++)
            {
                if((r==0||r==i-1)&&(c==0||c==i-1))
                {
                    arr[r][c]=ch;
                }
                else if(((r==0||r==i-1)&&(c!=0||c!=i-1))||((c==0||c==i-1)&&(r!=0||r!=i-1)))
                arr[r][c]=ch1;
                else
                arr[r][c]= ch2;
            }
        }
         
        for(int r =0;r<i;r++)
        {
            for (int c = 0;c<i;c++)
            {
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}
//ab
//
//
//
//

        