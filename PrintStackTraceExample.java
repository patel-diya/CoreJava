public class PrintStackTraceExample {
    public static void main(String []args)
    {
        try {
            m1();
        }catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("End of Code");
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println("c="+c);
    }
}
