package seminar9_Proxy_Strategy_State.dp_proxy;

public class TestProxy {

	public static void main(String[] args) {

		InterfataModulLogin login = new ModulLogin("10.0.0.1", 127);

		login = new ProxyLogin(login); // !!! interfata e implementata de ambele clase ModulLogin si ProxyLogin, deci
										// functioneaza

		if (login.login("admin", "admin12")) {
			System.out.println("Hello admin!");
		}

		String[] parole = new String[] { "1234", "123456", "admin12", "root", "admin12" };
		for (String parola : parole) {
			if (login.login("admin", parola)) {
				System.out.println("Parola gasita: " + parola);
			}
		}

		System.out.println("Log out");

	}

}
