package seminar4.banking;

public interface Transferable {
	public void transfer(Receivable destination, long amount) throws InsuficientFundsException; //interfata pentru implementarea transferurilor intre carduri
}
