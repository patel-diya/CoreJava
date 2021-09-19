import java.util.Scanner;

public class Employee {
    public static void main(String []args)
    {
        EmployeeInfo []emp=new EmployeeInfo[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            emp[i] = new EmployeeInfo();
            System.out.println("Enter the name of employee: ");
            emp[i].setName(sc.next());
        }

        System.out.println("List of Employees: ");

        for(int i=0; i<5; i++)
        {
            System.out.println(emp[i].getName());
        }
    }
}
