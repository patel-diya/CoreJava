class Employee1
{
    void show()
    {
        System.out.println("Employee");
    }
}

class Developer extends Employee1
{
    void show()
    {
        System.out.println("Developer");
    }
}

public class CastingExample {
    public static void main(String []args)
    {
        Developer d=new Developer();

        System.out.println("Upcasting");
        Employee1 e=d;
        e.show();

        System.out.println("Downcasting");
        Developer d2=(Developer)e;
        d2.show();
    }
}
