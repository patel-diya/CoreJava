class Parent2
{
    void career()
    {
        System.out.println("Traditional Career");
    }
}

class Child2 extends Parent2
{
    @Override
    void career()
    {
        System.out.println("Career in IT");
    }
}

public class OverridingExample {
    public static void main(String []args)
    {
        Child2 c=new Child2();
        c.career();
    }
}
