public class PremiumAccount extends BankAccount
{
    @Override
    public void setOwner()
    {
        owner = new Customer("Ole",2121);
    }

    @Override
    public boolean withdraw()
    {
        return false;
    }
}
