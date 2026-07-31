interface BankAccountOperations {
    void withdraw(double amount) throws InsufficientBalanceException;
    void transfer(double amount, String accountNumber) throws InsufficientBalanceException;
    void payBill(double amount, String billId) throws InsufficientBalanceException;
    double getAccountBalance();
}

public class BankAccount implements BankAccountOperations {
    private double accountBalance;

    BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > accountBalance)
            throw new InsufficientBalanceException();

        accountBalance -= amount;
    }

    @Override
    public void transfer(double amount, String accountNumber) throws InsufficientBalanceException {
        if(amount > accountBalance)
            throw new InsufficientBalanceException();

        accountBalance -= amount;
    }

    @Override
    public void payBill(double amount, String billId) throws InsufficientBalanceException {
        if(amount > accountBalance)
            throw new InsufficientBalanceException();

        accountBalance -= amount;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }
}
