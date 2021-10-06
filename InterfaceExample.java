interface Bank
{
    void createAcc();
    void depositAmt();
}

class ChaseBank implements Bank
        { @Override
            public void createAcc()
            {
                System.out.println("Create Acc");
            }
            @Override
            public void depositAmt()
            {
                System.out.println("Deposit Amt");
            }
        }

public class InterfaceExample {
    public static void main(String []args)
    {
        Bank b=new ChaseBank();
        b.createAcc();
        b.depositAmt();
    }
}
