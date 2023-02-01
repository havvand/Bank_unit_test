public class PenguinAccount extends BankAccount
{
    @Override
    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }

    {
        // Sets the owner to a specified Customer-object.
        owner = new Customer("Benny",Status.VIP);
        //System.out.println(getId());
    }

    @Override
    public boolean withdraw(double amount)
    {
        this.balance -= amount;
        return false;
    }
}
