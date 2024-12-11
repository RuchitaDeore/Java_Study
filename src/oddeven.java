import java.util.Scanner;

public class oddeven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start number : ");
        int start = sc.nextInt();

        System.out.println("End number : ");
        int end = sc.nextInt();

        for(int i=start;i<=40;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" is even");
            }else
            {
                System.out.println(i+ " is odd");
            }
        }
    }
}
