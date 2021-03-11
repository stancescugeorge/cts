package seminar3;

public interface Account {

	void withdraw(long amount) throws InsuficientFundsException;

	void deposit(long amount);

}