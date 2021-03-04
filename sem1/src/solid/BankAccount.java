package solid;

public class BankAccount {
	private String iban;
	private long balance;
	
	private Person accountHolder; //single-responsability

	public BankAccount(String iban, Person person) {
		this.iban = iban;
		this.balance = 0;
		this.accountHolder=person;
	}
	
	public void withdraw(long amount) {
		balance-=amount;
	}
	
	public void deposit(long amount) {
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
