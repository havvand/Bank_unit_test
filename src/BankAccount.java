import java.util.HashSet;

public abstract class BankAccount
{
    protected double balance;
    protected Customer owner;
    protected HashSet<Transaction> transactions = new HashSet<>();

    public BankAccount()
    {

    }

    public abstract void setOwner();

    public abstract boolean withdraw();

    public int getId()
    {
        return owner.getId();
    }

    public Transaction getTransactions()
    {
        return null;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public Customer getOwner()
    {
        return owner;
    }
}
