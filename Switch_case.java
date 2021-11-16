
//to convert a digit into alphabet form using switch case 
import java.util.Scanner;
class Switch_case
{
    public static void main (String args [])
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a digit");
        int d = sc.nextInt();
        switch (d)
        {
            case 0 :
            System.out.println(" your number is zero");
            break;
            case 1 :
            System.out.println(" your number is one ");
            break;
            case 2:
            System.out.println(" your number is two");
            break;
            case 3:
            System.out.println(" your number is three");
            break;
            case 4:
            System.out.println(" your number is four ");
            break;
            case 5 :
            System.out.println("your number is five");
            break;
            case 6 :
            System.out.println("your number is six");
            break;
            case 7 :
            System.out.println("your number is seven");
            break;
            case 8 :
            System.out.println("your number is eight");
            break; 
            case 9:
            System.out.println("your number is nine");
            break;
            default :
            System.out.println("invalid number input");
        }
    }
}
//vdt
// variable         type         use 
//    d             int           to store value  entered by the user and convert it into alphabet form 

//answer
//      d =7
//  ans = seven

//d = 0
// ans = zero

