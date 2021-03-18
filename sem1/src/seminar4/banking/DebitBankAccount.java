package seminar4.banking;

public class DebitBankAccount extends BankAccount implements Payable,Receivable,Transferable {
	
	private Person accountHolder; //single-responsibility

	public DebitBankAccount(NotificationService ns, String iban, Person person) {
		super(ns);
		this.iban = iban;
		this.balance = 0;
		this.accountHolder=person;
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if (amount > balance)
			throw new InsuficientFundsException("Insuficient funds " + balance);
		notificationService.sendNotification(accountHolder, "withdrawing " + amount + " from "+this.iban);
		balance-=amount;
	}
	
	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding " + amount + " to " + iban);
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
