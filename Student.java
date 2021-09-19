import java.util.Arrays;
import java.util.Scanner;

public class Student {
   public static void main(String []args)
    {
        int n;
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        n=sc.nextInt();
        StudentInfo[] s =new StudentInfo[n];

        for(int i=0; i<n; i++)
        {
            s[i]=new StudentInfo();
            System.out.println("Enter the Name of the Student: ");
            s[i].setName(sc.next());
            System.out.println("Enter the Roll No of the Student: ");
            s[i].setRollNo(sc.nextInt());
            System.out.println("Enter the Number of Courses the student has registered: ");
            s[i].setNo(sc.nextInt());
            no=s[i].getNo();
            String []course=new String[no];
            System.out.println("Enter Courses: ");
            for(int j=0; j<no; j++)
            {
                course[j]=sc.next();
                s[i].setCourse(course);
            }

        }

        for(int i=0; i<n; i++)
        {
            System.out.println("Name of the Student: "+s[i].getName());
            System.out.println("Roll No of the Student: "+s[i].getRollNo());
            System.out.println("Courses the Student: "+ Arrays.toString(s[i].getCourse()));
        }
    }
}
