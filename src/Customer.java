import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private Status status;
    private final int id;
    private static int idCounter = 1;

    final ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, Status status) {
        this.id = idCounter++;
        this.setName(name);
        this.setStatus(status);
    }

    // there may be only up to 3 accounts per customer.
    public boolean addAccount(BankAccount account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (this.accounts.size() >= 3) {
            throw new IllegalArgumentException("Customer already has 3 accounts");
        }
        if (account.getOwner() != this) {
            throw new IllegalArgumentException("Account does not belong to this customer");
        }
        this.accounts.add(account);
        return true;

    }

    public boolean removeAccount(BankAccount account) {
        if (this.accounts.size() == 0) {
            throw new IllegalArgumentException("Customer has no accounts");
        }
        if (account.getOwner() != this || !this.accounts.contains(account)) {
            throw new IllegalArgumentException("Account does not belong to this customer or does not exist.");
        }
        this.accounts.remove(account);
        return true;
    }

    // name must not contain a number either
    public void setName(String name) {
        if (name == null || name.equalsIgnoreCase("") || name.matches(".*\\d.*") || name.contains(",")) {
            this.name = null;
            throw new IllegalArgumentException("Name cannot be null or contain a number or a comma.");
        } else {
            this.name = name;
        }
    }


    public void setStatus(Status status) {

        if (status == null) {
            throw new IllegalArgumentException("Invalid status, try again later. Status will not be changed");
        }
        this.status = status;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Status getStatus() {
        return this.status;
    }
}
