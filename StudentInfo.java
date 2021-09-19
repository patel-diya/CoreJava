public class StudentInfo {
    private String name;
    private int no;
    private int roll;
    private String course[];

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setRollNo(int roll)
    {
        this.roll=roll;
    }

    public int getRollNo()
    {
        return roll;
    }

    public void setNo(int no)
    {
        this.no=no;
    }

    public int getNo()
    {
        return no;
    }

    public void setCourse(String[] course)
    {
        this.course=course;
    }

    public String[] getCourse()
    {
        return course;
    }
}
