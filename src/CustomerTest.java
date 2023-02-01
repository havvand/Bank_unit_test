import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CustomerTest
{
    BankAccount account;
    static Customer customerADULT;
    static Customer customerVIP;
    static Customer customerCHILD;

    @BeforeAll
    static public void setupBankAccount()
    {
        customerVIP = new Customer("VIP", Status.VIP);
        customerADULT = new Customer("ADULT", Status.ADULT);
        customerCHILD = new Customer("CHILD", Status.CHILD);

    }

    // Add accounts to customer BankAccounts :: Adds if the CustomerID matches the AccountOwnerID.
    @org.junit.jupiter.api.Test
    void addBankAccountInCustomerPenguin()
    {
        BankAccount account = new PenguinAccount();
        account.setOwner(customerVIP);
        assertTrue(customerVIP.addAccount(account));
        assertSame(customerVIP.accounts.get(0), account);
    }


    // Removes account if CustomerID matches AccountOwnerID ::
    @org.junit.jupiter.api.Test
    void removeAccount()
    {
        BankAccount account = new PenguinAccount();

        account.setOwner(customerCHILD);
        customerCHILD.addAccount(account);
        assertTrue(customerCHILD.removeAccount(account));
    }

    // PreCon = First and Last name :: Capital first letters :: No special chars ::
    @org.junit.jupiter.api.Test
    void setNameInCustomer()
    {
        customerADULT.setName("Jens"); // Setting name to Jens
        assertEquals(customerADULT.getName(), "Jens");
    }

    @org.junit.jupiter.api.Test
    void setCustomerStatus()
    {
        Customer owner = new Customer("Benny",Status.VIP);
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