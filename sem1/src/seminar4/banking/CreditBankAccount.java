package seminar4.banking;

public class CreditBankAccount extends BankAccount implements Receivable{

    public CreditBankAccount(NotificationService ns, String iban, Person accountHolder, long balance) {
    	super(ns);
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void deposit(long amount) {
        this.balance += amount;
        notificationService.sendNotification(accountHolder, "Adding " + amount + " to " + iban);
    }
    
    //STATIC FACTORY METHOD
    public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService ns, String iban, 
    		Person accountHolder, long balance) {
    	return new CreditBankAccount(ns, iban, accountHolder, balance);
    }
    
    public static CreditBankAccount createCreditBankAccount(NotificationService ns, String iban, 
    		Person accountHolder) {
    	return new CreditBankAccount(ns, iban, accountHolder, 0);
    }

    //mosteneste toString din BankAccount
//	@Override
//	public String toString() {
//		return "CreditBankAccount [iban=" + iban + ", balance=" + balance + "]";
//	}
    
    
}