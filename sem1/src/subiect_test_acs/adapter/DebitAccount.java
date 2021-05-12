package subiect_test_acs.adapter;

public class DebitAccount implements BankAccount{
	double value;
	int id;
	@Override
	public void accountTransfer(BankAccount account, double amount) {
		//e bn sa avem in interfata add value, remove value
		DebitAccount debitAccount=(DebitAccount)account;
		debitAccount.value+=amount;
		this.value-=amount;
	}
	
	
}
