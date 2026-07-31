interface InsufficientBalanceExceptionPrintable {
    String getErrorDescription();
}

public class InsufficientBalanceException extends Exception implements InsufficientBalanceExceptionPrintable  {
    @Override
    public String getErrorDescription() {
        return "The account doesn’t have enough money";
    }
}
