import PackageExample.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String []args)
    {
        int a,b;
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println("Add: "+c.add(a,b));
        System.out.println("Sub: "+c.sub(a,b));
        System.out.println("Mul: "+c.mul(a,b));
        System.out.println("Div: "+c.div(a,b));
    }
}
