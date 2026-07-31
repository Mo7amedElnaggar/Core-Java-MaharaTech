class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20_000.0);

        System.out.println("Account balance: " + account.getAccountBalance());

        try {
            try {
                account.withdraw(10_000);
                System.out.println("Withdraw successfully...");
            } catch(InsufficientBalanceException exp){
                System.out.println(exp.getErrorDescription());
            }

            try {
                account.transfer(5_000, "123456789012");
                System.out.println("Transfered successfully...");
            } catch(InsufficientBalanceException exp){
                System.out.println(exp.getErrorDescription());
            }

            try {
                account.payBill(10_000, "123456789012");
                System.out.println("Transfered successfully...");
            } catch(InsufficientBalanceException exp){
                System.out.println(exp.getErrorDescription());
            }
        } finally {
            System.out.println("Current account balance: " + account.getAccountBalance());
            System.out.println("Processes finished...");
        }
    }
}