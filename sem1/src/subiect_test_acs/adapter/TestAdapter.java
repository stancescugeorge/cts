package subiect_test_acs.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		ContBancarDebit cont=new ContBancarDebit(100, "ro12");
		BankAccount account=new AdapterCont2Account(cont);
		account.accountTransfer(new DebitAccount(), 40);
		
		System.out.println("Valoare in cont: "+cont.balanta);
	}

}
