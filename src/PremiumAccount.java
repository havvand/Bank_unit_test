public class PremiumAccount extends BankAccount
{
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
