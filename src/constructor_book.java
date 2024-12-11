public class constructor_book
{
    public static void main(String[] args)
    {
        books b1 = new books();
        b1.display();
        books b2 = new books("Bad", "XYZ", 2000);
        b2.display();
    }
}
class books
{
    String title;
    String author;
    int price;
    public books()
    {
        System.out.println("New book is being created");
        this.title = "Good";
        this.author = "ABC";
        this.price = 1000;
    }
    public books(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display()
    {
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
        System.out.println("Price = "+price);
        System.out.println("");
    }
}