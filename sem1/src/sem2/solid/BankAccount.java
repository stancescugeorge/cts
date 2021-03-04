package sem2.solid;

public class BankAccount {
	private String iban;
	private long balance;
	
	private Person accountHolder; //single-responsibility

	public BankAccount(String iban, Person person) {
		this.iban = iban;
		this.balance = 0;
		this.accountHolder=person;
	}
	
	public void withdraw(long amount) throws InsuficientFundsException {
		if (amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from "+this.iban);
		balance-=amount;
	}
	
	public void deposit(long amount) {
		System.out.println("adding "+String.valueOf(amount)+" to "+this.iban);
		balance+=amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}
	
}
