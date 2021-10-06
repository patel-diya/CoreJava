abstract class Vehicle
{
    abstract void speed();
}

class Car extends Vehicle
{
    void speed()
    {
        System.out.println("From Car class");
    }
}

class Bus extends Vehicle
{
    void speed()
    {
        System.out.println("From Bus class");
    }
}

public class AbstractClassExample {
    public static void main(String []args)
    {
        Vehicle v=new Bus();
        v.speed();
    }
}
