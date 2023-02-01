import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {



       static Customer customerADULT;
       static Customer customerVIP;
       static Customer customerCHILD;

        // Test data - we need customers so we can mess with the methods.
    @BeforeAll
    public static void initialize() {
        customerVIP = new Customer("VIP", Status.VIP);
        customerADULT = new Customer("ADULT", Status.ADULT);
        customerCHILD = new Customer("CHILD", Status.CHILD);
    }

    @Test
    void testOwnerNameContainsNumber() {
        BankAccount bankAccount = new SalaryAccount();
    }

        @Test
        void testNameWithNumbers () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.setOwner(customerADULT);
            assertThrows(IllegalArgumentException.class, () -> bankAccount.getOwner().setName("Jamal123"));
        }


        @Test
        void testNegativeDepositNumber () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.deposit(-10);
            assertEquals(50, bankAccount.getBalance());
        }


        @Test
        void withdrawNormalAmount () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.deposit(50);
            bankAccount.withdraw(10);
            assertEquals(40, bankAccount.getBalance());
        }

        @Test
        void withdrawNegativeAmount () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.deposit(50);
            bankAccount.withdraw(-10);
            assertEquals(50, bankAccount.getBalance());
        }

        @Test
        void getID () {
            BankAccount bankAccount1 = new SalaryAccount();
            BankAccount bankAccount2 = new SalaryAccount();
            BankAccount bankAccount3 = new SalaryAccount();
            bankAccount1.setOwner(customerVIP);
            bankAccount2.setOwner(customerADULT);
            bankAccount3.setOwner(customerCHILD);
            assertEquals(1, bankAccount1.getOwner().getID());
            assertEquals(2, bankAccount2.getOwner().getID());
            assertEquals(3, bankAccount3.getOwner().getID());
        }

        @Test
        void depositWithCharxd () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.deposit(50);
            System.out.println("after depositing 50 : " + bankAccount.getBalance());
            assertDoesNotThrow(() -> bankAccount.deposit('x'));
            assertEquals(170, bankAccount.getBalance());
            //Character.isDigit() -> use this to counteract the above (its a boolean).
            System.out.println("after adding 'x' : " + bankAccount.getBalance());
        }

        @Test
        void testBalanceOfSalary () {
            BankAccount bankAccount = new SalaryAccount();
            assertEquals(0, bankAccount.getBalance());
        }

        @Test
        void testDepositSalary () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.deposit(-100);
            assertFalse(bankAccount.getBalance() < 0);
        }

        @Test
        void getBalance () {
        }

        @Test
        void testOwnerShip () {
            BankAccount bankAccount = new SalaryAccount();
            bankAccount.setOwner(customerADULT);
            bankAccount.setOwner(customerVIP);
            assertSame(bankAccount.getOwner(), customerADULT);
        }
    }