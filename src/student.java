//no arg constructor

public class student
{
    String name;
    int age;
    int rollno;

    public student()
    {
        name = "Ruchita";
        age = 20;
        rollno = 24;
    }

    public static void main(String[] args)
    {
        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
    }
}