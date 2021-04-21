package seminar9_Proxy_Strategy_State.dp_state;

public class TestState {
	public static void main(String[] args) {
		SuperErou superman=new SuperErou("Superman", 100);
		
		superman.seDeplaseaza();
		superman.esteAtacat(50);
		superman.seDeplaseaza();
		superman.esteAtacat(45);
		superman.seDeplaseaza();
		superman.seVindeca(60);
		superman.seDeplaseaza();
	}
}
