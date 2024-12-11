//parameterized constructor

public class student2
{
    String name;
    int age;

    public student2(String n, int a)
    {
        this.name = n;
        this.age = a;
        System.out.println("name = "+n+" age = "+a);
    }

    public static void main(String[] args)
    {
        student2 s2 = new student2("Ruchita", 20);
        student2 s3 = new student2("abc", 2);
    }
}
