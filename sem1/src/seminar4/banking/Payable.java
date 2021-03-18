package seminar4.banking;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;;
}
