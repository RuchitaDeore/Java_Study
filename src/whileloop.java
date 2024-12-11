//while loop

public class whileloop
{
    public static void main(String[] args)
    {
        int a = 1, b = 4, fact = 1;
        while(a<=b)
        {
            fact = fact*a;
            a++;
        }
        System.out.println(fact);
    }
}