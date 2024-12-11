//no arg + parameterized + default constructor

public class course
{
    public static void main(String[] args)
    {
        coursename cn = new coursename();
        rectangle r = new rectangle(4,6);
        square sq = new square();
        sq.display();
    }
}
class coursename
{
    public coursename()
    {
        System.out.println("you are in course name constructor");
    }
}
class rectangle
{
    public rectangle(int length, int breadth)
    {
        System.out.println("Area of rectangle is : "+length*breadth);
    }
}
class square
{
    int s;
    public square()
    {
         s = 4;
    }
    public void display()
    {
        System.out.println(s);
    }
}