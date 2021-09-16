import java.util.Scanner;

public class AdvBasicOperations {

    public static void main(String []args){

        Operations o= new Operations();
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        char ch='y';
        while(ch=='y')
        {
            System.out.println("Enter 2 numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            o.setValue(a, b);
            System.out.println("Select: \n 1 Add \n 2 Subtract \n 3 Multiply \n 4 Divide \n 5 Exit");
            System.out.println("Select your choice: ");
            c=sc.nextInt();
            switch(c) {
                case 1:
                    System.out.println("Addition: " + o.add());
                    break;

                case 2:
                    System.out.println("Subtraction: " + o.sub());
                    break;

                case 3:
                    System.out.println("Multiplication: " + o.mul());
                    break;

                case 4:
                    System.out.println("Division: " + o.div());
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Enter 'y' if you want to continue: ");
            ch=sc.next().charAt(0);
        }

    }
}
