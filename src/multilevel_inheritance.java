//Multilevel inheritance

class animal1
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
class sound1 extends animal
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
class jump extends sound1
{
    public void jumping()
    {
        System.out.println("Cat jumped");
        System.out.println("Dog jumped");
    }
}
public class multilevel_inheritance
{
    public static void main(String[] args)
    {
        animal a1 = new animal();
        sound s1 = new sound();

        jump j1 = new jump();
        //single inheritance
        a1.dog();
        s1.dog();
        s1.bark();
        a1.cat();
        s1.cat();
        s1.meow();
        //multilevel inheritance
        j1.cat();
        j1.dog();
        j1.bark();
        j1.meow();
        j1.jumping();
    }
}
