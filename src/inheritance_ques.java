// Multilevel inheritance question

class vehicle
{
    String brand;
    int speed;
    public void start()
    {
        System.out.println("Car started");
    }
    public void stop()
    {
        System.out.println("Car stopped");
    }
}
class car extends vehicle
{
    int seatingCapacity;
    public void displayCarInfo()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Speed : "+speed);
        System.out.println("Seating Capacity : "+seatingCapacity);
    }
}
class ElectricCar extends car
{
    int batteryCapacity;
    public void displayElectricCarInfo()
    {
        System.out.println("Battery Capacity : "+batteryCapacity);
    }
}
public class inheritance_ques
{
    public static void main(String[] args)
    {
        ElectricCar ec = new ElectricCar();

        ec.brand = "Tesla";
        ec.speed = 120;
        ec.seatingCapacity = 5;
        ec.batteryCapacity = 75;

        ec.start();
        ec.displayCarInfo();
        ec.displayElectricCarInfo();
        ec.stop();
    }
}