import java.util.Scanner;
public class table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for(int i = 0;i<=10;i++)
        {
            System.out.println(i*d);
        }
    }
}
