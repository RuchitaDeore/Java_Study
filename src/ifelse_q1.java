import java.util.Scanner;
public class ifelse_q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in maths : ");
        Double maths = sc.nextDouble();
        System.out.println("Marks in Science : ");
        Double science = sc.nextDouble();
        System.out.println("Marks in English : ");
        Double english = sc.nextDouble();

        Double avg;
        avg = (maths+science+english) / 3;

        char grade;
        if(avg>=90)
        {
            grade = 'A';
        }
        else if(avg >=80)
        {
            grade = 'B';
        }
        else if(avg >=70)
        {
            grade = 'C';
        }
        else if(avg >=60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'E';
        }
        System.out.println("Average marks = "+avg);
        System.out.println("Grade = "+grade);
    }
}