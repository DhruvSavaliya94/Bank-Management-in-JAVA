package bankaccountmanagement.MyExceptionBank;
public class BalanceLessThan extends Exception{
    public BalanceLessThan(String msg) {
        super(msg);
    }
}
