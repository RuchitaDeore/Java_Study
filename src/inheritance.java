//Single inheritance

class animal
{
    public void dog()
    {
        System.out.println("In dog class");
    }
    public void cat()
    {
        System.out.println("In cat class");
    }
}
class sound extends animal
{
    public void bark()
    {
        System.out.println("Dog barking");
    }
    public void meow()
    {
        System.out.println("Cat meowing");
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        animal a1 = new animal();
        sound s1 = new sound();
        a1.dog();
        s1.dog();
        s1.bark();
        a1.cat();
        s1.cat();
        s1.meow();
    }
}
