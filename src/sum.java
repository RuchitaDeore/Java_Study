import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 0;i<=num;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of all numbers from 1 to "+num+" is : "+sum);
    }
}
