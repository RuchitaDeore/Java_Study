class S1
{
    String name;
    int rollNo;
    String course;
    Double marks;

    public S1(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    public S1(String name, int rollNo, String course, Double marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    public void displayDetails()
    {
        System.out.println("Student name : "+name);
        System.out.println("Student roll number : "+rollNo);
        System.out.println("Student's course : "+course);
        System.out.println("Student's marks : "+marks);
    }
}

public class constructor_ques
{
    public static void main(String[] args)
    {
        S1 s1 = new S1("Ritesh", 29);
        s1.displayDetails();
        S1 s2 = new S1("Ruchita", 24, "BCA", 8.77);
        s2.displayDetails();
        S1 s3 = new S1("ABC", 10, "XYZ", 8.3);
        s3.displayDetails();
    }
}