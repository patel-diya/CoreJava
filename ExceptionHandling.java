public class ExceptionHandling {
    public static void main(String []args)
    {
        int a=100;
        int b=0;
        int ar[]={5, 8};

        try
        {
            ar[4]=10;
            int c=a/b;
            System.out.println("c= "+c);
            System.out.println(ar[0]);

        }catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Error");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Finally block");
        }
    }
}
