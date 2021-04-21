package seminar9_Proxy_Strategy_State.dp_proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataModulLogin {

	InterfataModulLogin modulLogin = null;

	public static final int NR_MAX_INCERCARI = 3;
	public Map<String, Integer> nrIncercari = new HashMap<>(); // pt fiecare username stocam nr de incercari nereusite

	public ProxyLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String username, String pass) {
		Integer nrIncercariNereusite = nrIncercari.get(username); // primim null dc nu avem cheia in map4
		if (nrIncercariNereusite == null) {
			nrIncercari.put(username, 0);
			nrIncercariNereusite = 0;
		}

		if (modulLogin != null) {
			if (nrIncercariNereusite < NR_MAX_INCERCARI) { // PLECAM DE LA 0, deci max acceptat e 2
				if (modulLogin.login(username, pass)) {
					nrIncercariNereusite=0;
					nrIncercari.put(username,nrIncercariNereusite);
					return true;
				} else {
					nrIncercariNereusite += 1;
					nrIncercari.put(username,nrIncercariNereusite);
					return false;
				}
			} else {
				return false;
			}

		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean verificaStatusServer() {
		if (modulLogin != null) {
			return modulLogin.verificaStatusServer();
		} else {
			throw new UnsupportedOperationException();
		}
	}

}
