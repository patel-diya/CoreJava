    class Parent {
        int a;

        Parent() {
            super();
            System.out.println("Parent Constructor");
            a = 100;
        }
    }

    class Child extends Parent {
        int b;

        Child() {
            super();
            System.out.println("Child Constructor");
            b = 200;
        }

        void show() {
            System.out.println("a= " + a);
            System.out.println("b= " + b);
        }
    }
    public class InheritanceExample{
    public static void main(String []args)
    {
        Child c=new Child();
        c.show();
    }
}