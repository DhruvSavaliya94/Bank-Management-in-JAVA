package bankaccountmanagement.MyExceptionBank;
public class AccountNotFound extends Exception{
    public AccountNotFound(String msg) {
        super(msg);
    }
}
