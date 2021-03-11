package seminar3;

public class CreditBankAccount implements Receivable {
	
	private long balance;
	
	private String iban;
	
	private Person accountHolder;

	public CreditBankAccount(String iban, Person accountHolder, long balance) {
		this.balance = balance;
		this.iban = iban;
		this.accountHolder=accountHolder;
	}

	@Override
	public void deposit(long amount) {
		System.out.println("adding "+amount+" to "+this.iban);
		this.balance+=amount;

	}

}
