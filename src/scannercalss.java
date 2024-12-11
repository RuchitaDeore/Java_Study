import java.util.Scanner;

public class scannercalss
{
    public static void main(String[] args)
    {
        //user input, printing the values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String sr = sc.next();
        System.out.println("Enter your age : ");
        int t = sc.nextInt();
        System.out.println("Your name is "+sr+" and your age is "+t);
        char r = sc.next().charAt(2);
        System.out.println(r);
        float f = sc.nextFloat();
        System.out.println(f);
        double d = sc.nextDouble();
        System.out.println(d);
    }
}
