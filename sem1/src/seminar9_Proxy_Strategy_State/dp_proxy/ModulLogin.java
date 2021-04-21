package seminar9_Proxy_Strategy_State.dp_proxy;

public class ModulLogin implements InterfataModulLogin {
	
	String ipServer;
	int port;

	public ModulLogin(String ipServer, int port) {
		super();
		this.ipServer = ipServer;
		this.port = port;
	}

	@Override
	public boolean login(String username, String pass) {
		if(username.equals("admin")&&pass.equals("admin12")) {
			return true;
		} 
		else {
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return true;
	}

}
