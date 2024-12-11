import java.util.Scanner;

public class switchcase_q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        Double a = sc.nextDouble();
        System.out.println("Second number : ");
        Double b = sc.nextDouble();
        System.out.println("Operator +,-,*,/ ");
        char o = sc.next().charAt(0);

        switch(o)
        {
            case '+' :
                System.out.println(a + b);
                break;
            case '-' :
                System.out.println(a - b);
                break;
            case '*' :
                System.out.println(a * b);
                break;
            case '/' :
                System.out.println(a / b);
                break;
            default :
                System.out.println("Invalid operator");
        }
    }
}