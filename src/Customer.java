import java.util.ArrayList;
import java.util.Scanner;

public class Customer
{
    private String name;
    //private Status status = null;
    private int id;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, int id)
    {
        this.id = id;
        this.name = name;
    }

    public boolean addAccount(BankAccount account)
    {
        if(account.getId() == id)
        {
            accounts.add(account);
            return true;
        }
        return false;
    }

    public boolean removeAccount(BankAccount account)
    {
        if(account.getId() == id)
        {
            accounts.remove(account);
            return true;
        }
         return false;
    }

    public void setName(String name)
    {
        // If name stars with a capital letter, does not contain chars or numbers - set name to UserInput
        // userInput = scanner.....
       this.name = "Jens";
    }

    public void setStatus (String status)
    {

    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return name + " " + id;
    }
}
