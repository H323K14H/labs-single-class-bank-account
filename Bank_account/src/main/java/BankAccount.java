import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int bankBalance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.bankBalance = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String setFirstName) {
        this.firstName = setFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String setLastName) {
        this.lastName = setLastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate setDateOfBirth) {
        this.dateOfBirth = setDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public int getBankBalance() {
        return this.bankBalance;
    }

    public void setBankBalance(int setBankBalance) {
        this.bankBalance = setBankBalance;
    }

    public void deposit(int amount) {
        this.bankBalance += amount;
    }

    public void withdraw(int amount) {
        this.bankBalance -= amount;
    }

    public void payInterest() {
        this.bankBalance += (int) (this.bankBalance * 0.05);
    }
}
