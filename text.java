public class text
{
public static void main (String [] args)
{
int i = 9720;int j = 4;
while ((i%j) == 0)
{
i = i/j;
j = j + i;
}
System.out.print(j);
}
}