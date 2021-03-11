package seminar3;

public interface Transferable {
	public void transfer(Receivable destination, long amount) throws InsuficientFundsException; //interfata pentru implementarea transferurilor intre carduri
}
