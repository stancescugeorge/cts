package subiect_test_acs.adapter;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
}
