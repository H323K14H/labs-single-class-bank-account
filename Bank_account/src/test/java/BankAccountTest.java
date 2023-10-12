import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void canGetFirstName() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        String fName = b1.getFirstName();

        assertThat(fName).isEqualTo("Bob");
    }

    @Test
    void canSetFirstName() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.setFirstName("Darcy");
        String fName = b1.getFirstName();

        assertThat(fName).isEqualTo("Darcy");

    }

    //
    @Test
    void canGetLastName() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        String lName = b1.getLastName();

        assertThat(lName).isEqualTo("Bobby");
    }

    @Test
    void canSetLastName() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.setLastName("Fillet");
        String lName = b1.getLastName();

        assertThat(lName).isEqualTo("Fillet");
    }

    //
    @Test
    void canGetDateOfBirth() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        LocalDate dob = b1.getDateOfBirth();

        assertThat(dob).isEqualTo(LocalDate.of(2003, 10, 8));
    }

    @Test
    void canSetDateOfBirth() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.setDateOfBirth(LocalDate.of(2020, 2, 29));
        LocalDate dob = b1.getDateOfBirth();

        assertThat(dob).isEqualTo(LocalDate.of(2020, 2, 29));
    }

    @Test
    void canGetAccountNumber() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        int accountNumber = b1.getAccountNumber();
        assertThat(accountNumber).isEqualTo(11111111);
    }

    @Test
    void canSetAccountNumber() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.setAccountNumber(22222222);
        int accountNumber = b1.getAccountNumber();
        assertThat(accountNumber).isEqualTo(22222222);
    }

    @Test
    void canGetBankBalance() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        int bankBalance = b1.getBankBalance();
        assertThat(bankBalance).isEqualTo(0);
    }

    @Test
    void canSetBankBalance() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.setBankBalance(1000);
        int bankBalance = b1.getBankBalance();
        assertThat(bankBalance).isEqualTo(1000);
    }

    @Test
    void doesDepositWork() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.deposit(50);
        int updatedBalance = b1.getBankBalance();
        assertThat(updatedBalance).isEqualTo(50);

    }

    @Test
    void doesWithdrawWork() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.deposit(100);
        b1.withdraw(20);
        int updatedBalance = b1.getBankBalance();

        assertThat(updatedBalance).isEqualTo(80);
    }

    @Test
    void doesInterestPay() {
        BankAccount b1 = new BankAccount(
                "Bob",
                "Bobby",
                LocalDate.of(2003, 10, 8),
                11111111
        );
        b1.deposit(100);
        b1.payInterest();
        int updatedBalance = b1.getBankBalance();

        assertThat(updatedBalance).isEqualTo(105);
    }

}
