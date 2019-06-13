package bankaccountmanagement;
import bankaccountmanagement.MyExceptionBank.*;
import javax.swing.JOptionPane;
class Bank{
    
}
class Account{
    public void openAccount(){
        
    }
    public Double depositeMoney(Double mBal,Double dVal) throws BalanceLessThan,InsufficientBalance {
        try {
            if(dVal<0){
                throw new BalanceLessThan("Value is not exceptable");
            }
            else if((mBal+dVal)>50000){
                throw new InsufficientBalance("You can't deposite more than 50000");
            }
            else{
                mBal=mBal+dVal;
            }
        } catch (BalanceLessThan e) {
            JOptionPane.showMessageDialog(null, e); 
        } catch (InsufficientBalance e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mBal;
    }
    public Double withdrawalMoney(Double mBal,Double dVal) throws BalanceLessThan,InsufficientBalance {
        try {
            if(dVal<0){
                throw new BalanceLessThan("Value is not exceptable");
            }
            else if((mBal-dVal)<1000){
                throw new InsufficientBalance("Balance less than 1000 after transaction");
            }
            else{
                mBal=mBal-dVal;
            }
        } catch (BalanceLessThan e) {
            JOptionPane.showMessageDialog(null, e); 
        } catch (InsufficientBalance e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mBal;
    }
}
public class Banking {
    public static void main(String[] args) {     
    }
}
