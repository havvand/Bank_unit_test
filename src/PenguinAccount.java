public class PenguinAccount extends BankAccount
{
    @Override
    public void setOwner()
    {
        // Sets the owner to a specified Customer-object.
        owner = new Customer("Benny",1);
        //System.out.println(getId());
    }

    @Override
    public boolean withdraw()
    {
        return false;
    }
}
