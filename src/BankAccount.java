import java.util.HashSet;

public abstract class BankAccount
{
    protected double balance;
    protected Customer owner;

    protected HashSet<Transaction> transactions = new HashSet<>();

    public BankAccount()
    {

    }

    public abstract void setOwner(Customer owner);

    public abstract boolean withdraw(double amount);

    public int getId()
    {
        return owner.getID();
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
