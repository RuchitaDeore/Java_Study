//switch case

import java.util.Scanner;
public class switchcase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.next();

        switch(num)
        {
            case "m" :
                System.out.println("Monday");
                break;
            case "tu" :
                System.out.println("Tuesday");
                break;
            case "w" :
                System.out.println("Wednesday");
                break;
            case "t" :
                System.out.println("Thursday");
                break;
            case "f" :
                System.out.println("Friday");
                break;
            case "sat" :
                System.out.println("Saturday");
                break;
            case "s" :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid number");
                break;
        }
    }
}