import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CustomerTest
{
    BankAccount account;
    Customer customer;

    @BeforeAll
    void setupBankAccount()
    {

    }

    // Add accounts to customer BankAccounts :: Adds if the CustomerID matches the AccountOwnerID.
    @org.junit.jupiter.api.Test
    void addBankAccountInCustomerPenguin()
    {
        BankAccount account = new PenguinAccount();
        Customer owner = new Customer("Ole",1);
        account.setOwner();
        assertTrue(owner.addAccount(account));
        assertSame(owner.accounts.get(0), account);
    }

    @org.junit.jupiter.api.Test
    void addBankAccountInCustomerPremium()
    {
        BankAccount account = new PremiumAccount();
        Customer owner = new Customer("Ole",2121);
        account.setOwner();
        assertTrue(owner.addAccount(account));
        assertSame(owner.accounts.get(0), account);
    }

    // Removes account if CustomerID matches AccountOwnerID ::
    @org.junit.jupiter.api.Test
    void removeAccount()
    {
        BankAccount account = new PenguinAccount();
        Customer owner = new Customer("Ole",2);
        account.setOwner();
        assertTrue(owner.removeAccount(account));
    }

    // PreCon = First and Last name :: Capital first letters :: No special chars ::
    @org.junit.jupiter.api.Test
    void setNameInCustomer()
    {
        Customer owner = new Customer("Benny",1);
        owner.setName("Jens"); // Setting name to Jens
        assertEquals(owner.getName(), "Jens");
    }

    @org.junit.jupiter.api.Test
    void setCustomerStatus()
    {
        Customer owner = new Customer("Benny",1);
        owner.setName("Jens"); // Setting name to Jens
        assertEquals(owner.getName(), "Jens");
    }

    @org.junit.jupiter.api.Test
    void setStatusAccount()
    {
        /*Customer status = new Status(1);
        owner.setName();
        assertEquals(owner.toString(), "Ole");*/
    }


}