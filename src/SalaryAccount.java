public class SalaryAccount extends BankAccount
{
    private double creditLimit;

    public SalaryAccount()
    {

    }

    public void setCreditLimit(double amount)
    {

    }

    public double getCreditLimit()
    {
        return 0;
    }

    @Override
    public void setOwner()
    {
        owner = new Customer("Ole",1);
    }

    @Override
    public boolean withdraw()
    {
        return false;
    }
}
