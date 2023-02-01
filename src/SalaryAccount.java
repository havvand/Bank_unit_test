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
    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }

    @Override
    public boolean withdraw(double amount)
    {
        this.balance -= amount;
        return false;
    }
}
