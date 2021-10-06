class Parent1
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    void add(int a, float b)
    {
        System.out.println(a+b);
    }
}

class Child1 extends Parent1 {}

public class OverloadingExample {
    public static void main(String []args)
    {
        Child1 c= new Child1();
        c.add(5,4);
        c.add(5,6,7);
        c.add(7, 8f);
    }
}
