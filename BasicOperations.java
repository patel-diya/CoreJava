import java.util.Scanner;

public class BasicOperations {
    public static void main(String []args)
    {
        int n1, n2;
        System.out.println("Enter two numbers: ");
        Scanner sc =  new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        char ch='y';
        int m=1;
        do{
            switch(m)
            {
                case 1:
                    System.out.println("Addition: "+(n1+n2));
                    break;

                case 2:
                    System.out.println("Subtraction: "+(n1-n2));
                    break;

                case 3:
                    System.out.println("Multiplication: "+(n1*n2));
                    break;

                case 4:
                    System.out.println("Division: "+(n1/n2));
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            if(m!=5)
            {
                System.out.println("Enter 'y' if you want to continue: ");
                ch=sc.next().charAt(0);

                if(ch=='y')
                {
                    System.out.println("Select: \n 1 Add \n 2 Subtract \n 3 Multiply \n 4 Divide \n 5 Exit");
                    System.out.println("Select your choice: ");
                    m = sc.nextInt();
                }
            }
           else
            break;

        }while(ch=='y');

    }
}
