package seminar3;

public class DebitBankAccount extends BankAccount implements Payable,Receivable,Transferable {
	private String iban;
	private long balance;
	
	private Person accountHolder; //single-responsibility

	public DebitBankAccount(String iban, Person person) {
		this.iban = iban;
		this.balance = 0;
		this.accountHolder=person;
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if (amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from "+this.iban);
		balance-=amount;
	}
	
	@Override
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

	@Override
	public void transfer(Receivable destination, long amount) throws InsuficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
}
